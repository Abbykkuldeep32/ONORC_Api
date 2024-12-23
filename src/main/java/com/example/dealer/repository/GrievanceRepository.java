package com.example.dealer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dealer.model.Grievance;

import io.lettuce.core.dynamic.annotation.Param;

public interface GrievanceRepository extends JpaRepository<Grievance, Long> {
	
	@Query("SELECT r FROM Grievance r WHERE r.state_name = :statename AND r.district_name = :districtname")
	List<Grievance> findGrievancesByStatenameAndDistrictname(@Param("statename") String statename, @Param("districtname") String districtname);
}
