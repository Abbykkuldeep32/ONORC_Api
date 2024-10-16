package com.example.dealer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.model.GrievanceCategory;
import com.example.dealer.repository.GrievanceCategoryRepository;

@RestController
@RequestMapping("/api/v1/")
public class GrievanceCategoryController {
	
	@Autowired
	GrievanceCategoryRepository categoryrepository;
	
	@GetMapping("/grievance/category")
	public ResponseEntity<List<GrievanceCategory>> getAllGrievanceCategory(){
		List<GrievanceCategory> categorylist = new ArrayList<>();
		categoryrepository.findAll().forEach(categorylist::add);
		
		if(categorylist.isEmpty()) {
			
		}
		return new ResponseEntity<List<GrievanceCategory>>(categorylist,HttpStatus.OK);
	}
}
