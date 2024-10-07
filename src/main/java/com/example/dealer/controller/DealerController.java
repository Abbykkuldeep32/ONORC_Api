package com.example.dealer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import com.example.dealer.repository.DealerRepository;
import com.example.dealer.model.Dealer;

@RestController
@RequestMapping("/api/v1/")
public class DealerController {
	
	@Autowired
	DealerRepository dealerrepository;
	
	@GetMapping("/dealer")
	public ResponseEntity<List<Dealer>> getAllDealer(){
		List<Dealer> dealerlist = new ArrayList<>();
		dealerrepository.findAll().forEach(dealerlist::add);
		
		if(dealerlist.isEmpty()) {
			
		}
		return new ResponseEntity<List<Dealer>>(dealerlist,HttpStatus.OK);
	}
}
