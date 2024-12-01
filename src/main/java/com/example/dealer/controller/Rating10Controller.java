package com.example.dealer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.model.Rating10;
import com.example.dealer.service.Rating10Service;

@RestController
@RequestMapping("/api/v1/rating")
public class Rating10Controller {
	
	@Autowired
	private Rating10Service rating10Service;
	
	@GetMapping("/top-fps")
    public List<Rating10> getTopUsersByRating(@RequestBody Rating10 rat) {
        return rating10Service.getTop10UsersByAverageRating(rat.getState_code(),rat.getDistrict_code());
    }
}
