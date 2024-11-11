package com.example.dealer.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.YearMonth;
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

    @GetMapping("/{rationCardNo}/{transactionDate}")
    public ResponseEntity<List<Sale>> getSaleByRationCardNo(
    		@PathVariable String rationCardNo,
    		@PathVariable String transactionDate){
    	//LocalDate localDate = LocalDate.parse(transactionDate);
    	YearMonth yearMonth = YearMonth.parse(transactionDate);
    	List<Sale> sale= saleService.getSaleByRationCardNo(rationCardNo,yearMonth);
        
        if (sale != null) {
        	return ResponseEntity.ok(sale);
        } else {
            return ResponseEntity.notFound().build(); 
        }
    }
    
    @GetMapping("/generate-receipt/{id}")
    public ResponseEntity<byte[]> generatePdf(@PathVariable("id") Long id) throws IOException {
        byte[] pdf = pdfService.generateReceiptPdf(id);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("filename", "receipt.pdf");

        return ResponseEntity.ok().headers(headers).body(pdf);
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
