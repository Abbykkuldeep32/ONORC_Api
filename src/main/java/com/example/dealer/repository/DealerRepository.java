package com.example.dealer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.dealer.model.Dealer;

public interface DealerRepository extends JpaRepository<Dealer,String> {

	@Query("SELECT s FROM Dealer s WHERE s.statename = :statename AND s.mobileno = :mobileno")
    List<Dealer> findByStateAndMobileNumber(@Param("statename") String state, @Param("mobileno") String mobileno);
	
	@Query("SELECT s FROM Dealer s WHERE s.mobileno = :mobileno")
    List<Dealer> findByMobileNo(@Param("mobileno") String mobileno);
	
}
