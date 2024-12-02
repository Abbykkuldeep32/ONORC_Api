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

@RestController
@RequestMapping("/api/v1/saledetail")
public class SaleController {
	
	@Autowired
    private SaleService saleService;
	
	@Autowired
    private PdfService pdfService;


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
    
    @GetMapping("/generate-receipt/{id}")
    public ResponseEntity<byte[]> generatePdf(@PathVariable("id") Long id) throws Exception{
    	
    	byte[] pdf = pdfService.generateReceiptPdf(id);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("filename", "receipt.pdf");

        return ResponseEntity.ok().headers(headers).body(pdf);
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
