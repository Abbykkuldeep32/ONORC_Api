package com.example.dealer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dealer.model.Rating;

import io.lettuce.core.dynamic.annotation.Param;

public interface RatingRepository extends JpaRepository<Rating,Short>{
	
	List<Rating> findByFpsid(String fpsid);

	@Query("SELECT r FROM Rating r WHERE r.fpsid = :fpsid AND " +
		       "NOT EXISTS (SELECT w FROM Word w WHERE r.message LIKE CONCAT('%', w.word, '%'))")
	    List<Rating> findRatingsWithoutWordsByFpsid(@Param("fpsid") String fpsid);
}
