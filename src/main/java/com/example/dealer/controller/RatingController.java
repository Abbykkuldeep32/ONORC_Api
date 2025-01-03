package com.example.dealer.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    		@PathVariable String fpsid,
    		@RequestParam(required = false, defaultValue = "false") boolean excludeWords){
		List<Rating> ratings;

        if (excludeWords) {
            ratings = ratingService.getRatingsWithoutWords(fpsid);
        } else {
            ratings = ratingService.getRatingByFpsid(fpsid);
        }

        if (ratings != null && !ratings.isEmpty()) {
            return ResponseEntity.ok(ratings);
        } else {
            return ResponseEntity.ok(ratings);
        }
    }
	
	@PostMapping("/dfso")
    public List<Rating> getUsersByRating(@RequestBody Rating rat) {
        return ratingService.getRatingByStateAndDistrict(rat.getState_code(),rat.getDistrict_code());
    }
	
	@PostMapping("/top-rated-fps")
    public List<Map<String, Object>> getTopUsersByRating(@RequestBody Rating rat) {
        return ratingService.getTop10UsersByAverageRating(rat.getState_code(),rat.getDistrict_code());
    }
	
	@PostMapping("/low-rated-fps")
    public List<Map<String, Object>> getLowUsersByRating(@RequestBody Rating rat) {
        return ratingService.getLow10UsersByAverageRating(rat.getState_code(),rat.getDistrict_code());
    }
	
}
