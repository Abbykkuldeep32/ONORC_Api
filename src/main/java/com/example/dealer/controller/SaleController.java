package com.example.dealer.controller;

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
@RequestMapping("/api/v1/sale")
public class SaleController {
	
	@Autowired
    private SaleService saleService;

    @GetMapping("/{rationCardNo}")
    public ResponseEntity<List<Sale>> getStockByRationCardNo(
    		@PathVariable String rationCardNo){
    	List<Sale> sale= saleService.getStockByRationCardNo(rationCardNo);
        
        if (sale != null) {
        	return ResponseEntity.ok(sale);
        } else {
            return ResponseEntity.notFound().build(); // Return 404 if not found
        }
    }

}
