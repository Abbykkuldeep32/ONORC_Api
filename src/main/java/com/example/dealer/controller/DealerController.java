package com.example.dealer.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import com.example.dealer.repository.DealerRepository;
import com.example.dealer.service.DealerService;
import com.example.dealer.model.Dealer;

@RestController
@RequestMapping("/api/v1/")
public class DealerController {
	
	@Autowired
	DealerRepository dealerrepository;
	
	@Autowired
	DealerService dealerservice;
	
	@GetMapping("/dealer/{statename}/{mobile_no}")
	public ResponseEntity<Object> getDealerByFpsid(
    		@PathVariable String statename,
    		@PathVariable String mobile_no){
    	List<Dealer> fps= dealerservice.getDealerByFpsid(statename, mobile_no);
        
        if (fps != null && !fps.isEmpty()) {
        	return ResponseEntity.ok(fps);
        } else {
        	Map<String, Object> response = new HashMap<>();
            response.put("status", false); 
            response.put("message", "Dealer Does not exist"); 

            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
    }
}
