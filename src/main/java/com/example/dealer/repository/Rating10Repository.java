package com.example.dealer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.dealer.model.Rating;
import com.example.dealer.model.Rating10;

public interface Rating10Repository extends CrudRepository<Rating10,Short>{
	@Query(value = "SELECT rating_id,state_code,district_code,fps_id,star, AVG(star) AS averageRating " +
            "FROM tbl_rating " +
            "GROUP BY rating_id,state_code,district_code,fps_id,star " +
            "HAVING COUNT(star) > 0 " +
            "ORDER BY averageRating DESC " +
            "LIMIT 10", nativeQuery = true)
	List<Rating10> findTop10UsersByAverageRating();
}
