package com.example.dealer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.dealer.model.Rating;
import com.example.dealer.model.Rating10;

public interface Rating10Repository extends CrudRepository<Rating10,Short>{
	@Query(value = "SELECT r.fpsid, f.fpsowner, AVG(r.star) as avgStar " +
            "FROM Rating r " +
            "JOIN Dealer f ON r.fpsid = f.fpsid " +
            "WHERE r.state_code = :state AND r.district_code = :district " +
            "GROUP BY r.fpsid, f.fpsowner " +
            "ORDER BY avgStar DESC " +
            "LIMIT 10", nativeQuery = true)
	List<Rating10> findTop10UsersByAverageRating(@Param("state") Long state, @Param("district") String district);
}
