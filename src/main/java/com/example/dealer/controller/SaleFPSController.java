package com.example.dealer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.model.SaleFPS;
import com.example.dealer.service.SaleFPSService;





@RestController
@RequestMapping("/api/v1/sale")
public class SaleFPSController {
	
	@Autowired
    private SaleFPSService salefpsService;
	
    @GetMapping("/{fpsid}/{transactionDate}")
    public ResponseEntity<List<SaleFPS>> getStockByFpsid(
    		@PathVariable String fpsid,
    		@PathVariable String transactionDate){
    	List<SaleFPS> fpssale= salefpsService.getStockByFpsid(fpsid, transactionDate);
        
        if (fpssale != null) {
        	return ResponseEntity.ok(fpssale);
        } else {
            return ResponseEntity.notFound().build(); // Return 404 if not found
        }
    }

}
