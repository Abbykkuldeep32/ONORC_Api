package com.example.dealer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.model.Rating;
import com.example.dealer.repository.RatingRepository;

@Service
public class RatingService {
	
	@Autowired
    private RatingRepository ratingRepository;

	public List<Rating> getRatingByFpsid(String fpsid) {
		
		return ratingRepository.findByFpsid(fpsid);
	}
	
	public List<Rating> getRatingsWithoutWords(String fpsid) {
       
        return ratingRepository.findRatingsWithoutWordsByFpsid(fpsid);
    }
	
}
