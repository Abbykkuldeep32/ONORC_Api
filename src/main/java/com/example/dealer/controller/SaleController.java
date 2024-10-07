package com.example.dealer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.dealer.model.Sale;
import com.example.dealer.repository.SaleRepository;

@RestController
@RequestMapping("/api/v1")
public class SaleController {
	
	@Autowired
	SaleRepository salerepository;
	
	@GetMapping("/sale")
	public ResponseEntity<List<Sale>> getAllSale(){
		List<Sale> salelist = new ArrayList<>();
		salerepository.findAll().forEach(salelist::add);
		return new ResponseEntity<List<Sale>>(salelist,HttpStatus.OK);
	}

}
