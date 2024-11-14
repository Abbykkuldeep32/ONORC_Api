package com.example.dealer.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.model.SaleFPS;
import com.example.dealer.response.AggregatedSaleResponseTwo;
import com.example.dealer.service.SaleFPSService;


@RestController
@RequestMapping("/api/v1/sale")
public class SaleFPSController {
	
	@Autowired
    private SaleFPSService salefpsService;
	
    @GetMapping("/{fpsid}/{transactionDate}")
    public ResponseEntity<List<AggregatedSaleResponseTwo>> getStockByFpsid(
    		@PathVariable String fpsid,
    		@PathVariable String transactionDate){
    	
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
           
            LocalDate formattedDate = LocalDate.parse(transactionDate, formatter);

            // Fetch data from the service using the parsed LocalDate
            List<AggregatedSaleResponseTwo> fpsSale = salefpsService.getStockByFpsid(fpsid, formattedDate);

            if (fpsSale != null && !fpsSale.isEmpty()) {
                return ResponseEntity.ok(fpsSale);
            } else {
                return ResponseEntity.ok(new ArrayList<>()); 
            }

        } catch (DateTimeParseException e) {
        	e.printStackTrace();
            // Return 400 if the date format is incorrect
            return ResponseEntity.badRequest().body(null);
        }
    }
    
    @GetMapping("/ration")
    public ResponseEntity<List<SaleFPS>> getStockByRationCardNo(
    		@RequestBody SaleFPS sale){
    	List<SaleFPS> ration= salefpsService.getStockByRationCardNo(sale.getFpsid(), sale.getRationcardid());
        
        if (ration != null) {
        	return ResponseEntity.ok(ration);
        } else {
            return ResponseEntity.notFound().build(); // Return 404 if not found
        }
    }

}
