package com.example.dealer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.model.Stock;
import com.example.dealer.service.StockService;

@RestController
@RequestMapping("/api/stock")
public class StockController{
	
	@Autowired
    private StockService stockService;

    @GetMapping("/{fpsid}/{stockDate}/{stockTime}")
    public ResponseEntity<List<Stock>> getStockByFpsidDateAndTime(
    		@PathVariable Long fpsid,
    		@PathVariable String stockDate,
    		@PathVariable String stockTime){
    	List<Stock> stock= stockService.getStockByFpsidDateAndTime(fpsid, stockDate, stockTime);
        
        if (stock != null) {
            return ResponseEntity.ok(stock);
        } else {
            return ResponseEntity.notFound().build(); // Return 404 if not found
        }
    }
}
