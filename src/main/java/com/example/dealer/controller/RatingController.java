package com.example.dealer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.model.Rating;
import com.example.dealer.service.RatingService;

@RestController
@RequestMapping("/api/v1/rating")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	@GetMapping("/{fpsid}")
    public ResponseEntity<List<Rating>> getRatingByFpsid(
    		@PathVariable String fpsid){
    	List<Rating> rating= ratingService.getRatingByFpsid(fpsid);
        
        if (rating != null) {
        	return ResponseEntity.ok(rating);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
