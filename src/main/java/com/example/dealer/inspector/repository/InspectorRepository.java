package com.example.dealer.inspector.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.dealer.inspector.model.InspectorLogin;

public interface InspectorRepository extends JpaRepository<InspectorLogin, String>{

	@Query("SELECT s FROM InspectorLogin s WHERE s.statename = :statename AND s.mobileno = :mobileno")
    List<InspectorLogin> findByStateAndMobileNumber(@Param("statename") String state, @Param("mobileno") String mobileno);
	
	@Query("SELECT s FROM InspectorLogin s WHERE s.mobileno = :mobileno")
    List<InspectorLogin> findByMobileNo(@Param("mobileno") String mobileno);
}
