package com.example.dealer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.model.Rating10;
import com.example.dealer.repository.Rating10Repository;

@Service
public class Rating10Service {
	@Autowired
    private Rating10Repository rating10Repository;
	
	public List<Rating10> getTop10UsersByAverageRating() {
        return rating10Repository.findTop10UsersByAverageRating();
    }
}
