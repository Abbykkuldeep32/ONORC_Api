package com.example.dealer.controller;

import java.io.IOException;
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
import com.example.dealer.response.AggregatedSaleResponse;
import com.example.dealer.service.PdfService;
import com.example.dealer.service.SaleService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

@RestController
@RequestMapping("/api/v1/saledetail")
public class SaleController {
	
	@Autowired
    private SaleService saleService;
	
	@Autowired
    private PdfService pdfService;
	
	private static final String SECRET_KEY = "dGhpc2lzYSByYW5kb21zZWNyZXRrZXkuLi5pbmNsdWRldXNlZm9yc2VjdXJpdHk="; // Must match React key
    private static final String ALGORITHM = "AES/CBC/PKCS5Padding";


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
        
    	Long id = decryptEncryptedId(encryptedId);
    	System.out.println("Decrypted ID: " + id);
    	
    	byte[] pdf = pdfService.generateReceiptPdf(id);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("filename", "receipt.pdf");

        return ResponseEntity.ok().headers(headers).body(pdf);
    }
    
    private Long decryptEncryptedId(String encryptedId) throws Exception{
    	String[] parts = encryptedId.split(":");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid encrypted ID format");
        }

        String ivBase64 = parts[0];
        String cipherTextBase64 = parts[1];

        byte[] iv = Base64.getDecoder().decode(ivBase64);
        byte[] cipherText = Base64.getDecoder().decode(cipherTextBase64);

        // Prepare AES key and IV
        SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);

        byte[] decryptedBytes = cipher.doFinal(cipherText);

        String decryptedString = new String(decryptedBytes);
        
        return Long.parseLong(decryptedString);
	}

	@PostMapping("/search")
    public ResponseEntity<List<Sale>> getSaleByMemberName(
    		@RequestBody Sale ssale){
    	List<Sale> sale= saleService.getSaleByMemberName(ssale.getMembername());
        
        if (sale != null) {
        	return ResponseEntity.ok(sale);
        } else {
            return ResponseEntity.notFound().build(); 
        }
    }
    

}
