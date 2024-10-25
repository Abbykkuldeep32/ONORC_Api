package com.example.dealer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dealer.model.Rating;

public interface RatingRepository extends JpaRepository<Rating,Short>{
	
	List<Rating> findByFpsid(String fpsid);

}
