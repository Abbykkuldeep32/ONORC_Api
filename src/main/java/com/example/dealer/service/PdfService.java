package com.example.dealer.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.format.DateTimeFormatter;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.example.dealer.model.Sale;
import com.example.dealer.repository.SaleRepository;
import com.example.dealer.util.QRCodeGenerator;

@Service
public class PdfService {

    private final SaleRepository saleRepository;


    public PdfService(SaleRepository saleRepository) {
		super();
		this.saleRepository = saleRepository;
	}


	public byte[] generateReceiptPdf(Sale receipt) throws IOException {
		

        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);

        contentStream.beginText();
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
        contentStream.newLineAtOffset(250, 750);
        contentStream.showText("Sales Receipt");
        contentStream.endText();

        InputStream imageStream = new ClassPathResource("static/images/logo.png").getInputStream();
        PDImageXObject pdImage = PDImageXObject.createFromByteArray(document, imageStream.readAllBytes(), "logo");
        contentStream.drawImage(pdImage, 40, 703, 100, 50);
        
        contentStream.beginText();
        contentStream.setFont(PDType1Font.HELVETICA, 16);
        contentStream.newLineAtOffset(110, 720);
        contentStream.showText("Department of Food, Civil Supplies and Consumer Affairs");
        contentStream.endText();
        
        // line after header
        contentStream.setLineWidth(1f); // Set line width
        contentStream.moveTo(50, 710); // Starting point of the line (x1, y1)
        contentStream.lineTo(550, 710); // Ending point of the line (x2, y2)
        contentStream.stroke();

        String qrData = "Transaction ID: " + receipt.getTransaction_id(); // or any other data you want in the QR code
        byte[] qrCodeBytes = null;
		try {
			qrCodeBytes = QRCodeGenerator.getQRCodeAsByteArray(qrData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        PDImageXObject qrCodeImage = PDImageXObject.createFromByteArray(document, qrCodeBytes, "QR Code");

        // Position the QR code in the PDF (adjust coordinates as needed)
        contentStream.drawImage(qrCodeImage, 400, 600, 100, 100);
        
        // Transaction details
        contentStream.beginText();
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 10);
        contentStream.newLineAtOffset(50, 690);
        contentStream.showText("Transaction ID: " + receipt.getTransaction_id());
        contentStream.newLineAtOffset(0, -15);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = receipt.getTransaction_date().format(formatter);
        contentStream.showText("Transaction Date: " + formattedDate);
        contentStream.newLineAtOffset(0, -15);
        contentStream.showText("Ration Card Number: " + receipt.getRationcardid());
        contentStream.newLineAtOffset(0, -15);
        contentStream.showText("Ration Card Type: " + receipt.getCard_type());
        contentStream.newLineAtOffset(0, -15);
        contentStream.showText("Purchasing Member: " + receipt.getMembername());
        contentStream.newLineAtOffset(0, -15);
        contentStream.showText("Mode of Transaction: " + receipt.getTxn_type());
        contentStream.endText();

     // line after header
        contentStream.setLineWidth(1f); // Set line width
        contentStream.moveTo(50, 500); // Starting point of the line (x1, y1)
        contentStream.lineTo(550, 500); // Ending point of the line (x2, y2)
        contentStream.stroke();
        
        // Ration Taken Section
        contentStream.beginText();
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
        contentStream.newLineAtOffset(50, 550);
        contentStream.showText("Ration Distributed");
        contentStream.endText();

     // line after header
        contentStream.setLineWidth(1f); // Set line width
        contentStream.moveTo(50, 560); // Starting point of the line (x1, y1)
        contentStream.lineTo(550, 560); // Ending point of the line (x2, y2)
        contentStream.stroke();
        
        contentStream.beginText();
        contentStream.setFont(PDType1Font.HELVETICA, 10);
        contentStream.newLineAtOffset(50, 530);
        contentStream.showText("Commodity: " + receipt.getCommodity_name());
        contentStream.newLineAtOffset(0, -15);
        contentStream.showText("Quantity: " + receipt.getDistributed_quanitity());
        contentStream.endText();
        
        // Ration Balance Section
        contentStream.beginText();
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
        contentStream.newLineAtOffset(50, 470);
        contentStream.showText("Ration Entitlement");
        contentStream.endText();
        

        contentStream.beginText();
        contentStream.setFont(PDType1Font.HELVETICA, 10);
        contentStream.newLineAtOffset(50, 450);
        contentStream.showText("Commodity: " + receipt.getCommodity_name());
        contentStream.newLineAtOffset(0, -15);
        contentStream.showText("Capacity: " + receipt.getEntitlement_quanitity());
        contentStream.endText();


        contentStream.close();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        document.save(byteArrayOutputStream);
        document.close();

        return byteArrayOutputStream.toByteArray();
    }
}
