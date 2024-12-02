package com.example.dealer.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
	
	public List<Map<String, Object>> getTop10UsersByAverageRating(Long statecode,String districtcode) {
		List<Object[]> results = ratingRepository.findTop10UsersByAverageRating(statecode,districtcode);
		
		if (results.isEmpty()) {
	        System.out.println("No results found for statecode: " + statecode + " and districtcode: " + districtcode);
	    }
		
		return results.stream().map(row -> {
	        Map<String, Object> map = new HashMap<>();
	        map.put("fpsId", row[0]);
	        map.put("fpsname", row[1]);
	        map.put("avgStar", row[2]);
	        return map;
	    }).collect(Collectors.toList());
    }
	
	public List<Map<String, Object>> getLow10UsersByAverageRating(Long statecode,String districtcode) {
		List<Object[]> results = ratingRepository.findLow10UsersByAverageRating(statecode,districtcode);
		
		if (results.isEmpty()) {
	        System.out.println("No results found for statecode: " + statecode + " and districtcode: " + districtcode);
	    }
		
		return results.stream().map(row -> {
	        Map<String, Object> map = new HashMap<>();
	        map.put("fpsId", row[0]);
	        map.put("fpsname", row[1]);
	        map.put("avgStar", row[2]);
	        return map;
	    }).collect(Collectors.toList());
    }
	
}
