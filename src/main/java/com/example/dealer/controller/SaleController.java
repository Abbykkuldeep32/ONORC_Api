package com.example.dealer.controller;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.dealer.model.Sale;
import com.example.dealer.repository.SaleRepository;
import com.example.dealer.response.AggregatedSaleResponse;
import com.example.dealer.service.PdfService;
import com.example.dealer.service.SaleService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/api/v1/saledetail")
public class SaleController {
	
	@Autowired
    private SaleService saleService;
	
	@Autowired
    private PdfService pdfService;
	
	@Autowired
	private SaleRepository saleRepository;


    @GetMapping("/{rationCardNo}/{transactionDate}")
    public ResponseEntity<AggregatedSaleResponse[]> getSaleByRationCardNo(
    		@PathVariable String rationCardNo,
    		@PathVariable String transactionDate){
    	//LocalDate localDate = LocalDate.parse(transactionDate);
    	YearMonth yearMonth = YearMonth.parse(transactionDate);
    	AggregatedSaleResponse[] sales= saleService.getSaleByRationCardNo(rationCardNo,yearMonth);
        
        if (sales != null) {
        	return ResponseEntity.ok(sales);
        } else {
        	return ResponseEntity.ok(new AggregatedSaleResponse[0]); 
        }
    }
    
    @GetMapping("/generate-receipt/{encryptedId}")
    public ResponseEntity<byte[]> generatePdf(@PathVariable("encryptedId") String encryptedId) throws Exception{
    	
    	//String encryptedId = hashId(id);
    	
    	Sale receipt = saleRepository.findReceiptByEncryptedId(encryptedId)
                .orElseThrow(() -> new RuntimeException("Receipt not found"));
    	
    	byte[] pdf = pdfService.generateReceiptPdf(receipt);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("filename", "receipt.pdf");

        return ResponseEntity.ok().headers(headers).body(pdf);
    }
	
	private String hashId(Long id) {
		try {
	        MessageDigest md = MessageDigest.getInstance("MD5");
	        md.update(id.toString().getBytes());
	        byte[] digest = md.digest();

	        // Convert byte array to hex string
	        StringBuilder hexString = new StringBuilder();
	        for (byte b : digest) {
	            hexString.append(String.format("%02x", b));
	        }
	        return hexString.toString();
	    } catch (NoSuchAlgorithmException e) {
	        throw new RuntimeException("Error generating MD5 hash", e);
	    }
	}

	@PostMapping("/searchbyname")
	public ResponseEntity<List<Sale>> getSaleByMemberName(
    		@RequestBody Sale ssale){
		System.out.print(ssale.getMembername());
    	List<Sale> sale= saleService.getSaleByMemberName(ssale.getMembername());
        
        if (sale != null) {
        	return ResponseEntity.ok(sale);
        } else {
            return ResponseEntity.notFound().build(); 
        }
    }
    

}
