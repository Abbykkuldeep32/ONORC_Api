package com.example.dealer.godown.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.dealer.godown.model.GodownLogin;


public interface GodownRepository extends JpaRepository<GodownLogin, String> {
	
	@Query("SELECT s FROM GodownLogin s WHERE s.statename = :statename AND s.mobileno = :mobileno")
    List<GodownLogin> findByStateAndMobileNumber(@Param("statename") String state, @Param("mobileno") String mobileno);
	
	@Query("SELECT s FROM GodownLogin s WHERE s.mobileno = :mobileno")
    List<GodownLogin> findByMobileNo(@Param("mobileno") String mobileno);
}
