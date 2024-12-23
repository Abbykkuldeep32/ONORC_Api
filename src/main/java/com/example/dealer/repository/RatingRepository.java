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
	
	
	@Query(value = "SELECT r.fpsid, d.fpsowner, AVG(r.star) " +
            "FROM Rating r " +
            "JOIN Dealer d ON r.fpsid = d.fpsid " +
            "WHERE r.state_code = :statecode AND r.district_code = :districtcode " +
            "GROUP BY r.fpsid, d.fpsowner " +
            "ORDER BY AVG(r.star) DESC")
	List<Object[]> findTop10UsersByAverageRating(@Param("statecode") Long statecode, @Param("districtcode") String districtcode);
	
	@Query(value = "SELECT r.fpsid, d.fpsowner, AVG(r.star) " +
            "FROM Rating r " +
            "JOIN Dealer d ON r.fpsid = d.fpsid " +
            "WHERE r.state_code = :statecode AND r.district_code = :districtcode " +
            "GROUP BY r.fpsid, d.fpsowner " +
            "ORDER BY AVG(r.star) ASC")
	List<Object[]> findLow10UsersByAverageRating(@Param("statecode") Long statecode, @Param("districtcode") String districtcode);
	
	@Query("SELECT r FROM Rating r WHERE r.state_code = :statecode AND r.district_code = :districtcode")
	List<Rating> findByStatecodeAndDistrictcode(@Param("statecode") Long statecode,@Param("districtcode") String districtcode);
}
