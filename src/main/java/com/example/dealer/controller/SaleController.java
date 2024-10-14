package com.example.dealer.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.dealer.model.Sale;
import com.example.dealer.service.SaleService;

@RestController
@RequestMapping("/api/v1/saledetail")
public class SaleController {
	
	@Autowired
    private SaleService saleService;

    @GetMapping("/{rationCardNo}/{transactionDate}")
    public ResponseEntity<List<Sale>> getSaleByRationCardNo(
    		@PathVariable String rationCardNo,
    		@PathVariable LocalDate transactionDate){
    	//LocalDate localDate = LocalDate.parse(transactionDate); 
    	List<Sale> sale= saleService.getSaleByRationCardNo(rationCardNo,transactionDate);
        
        if (sale != null) {
        	return ResponseEntity.ok(sale);
        } else {
            return ResponseEntity.notFound().build(); // Return 404 if not found
        }
    }

}
