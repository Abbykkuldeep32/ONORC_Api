package com.example.dealer.dfso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.dealer.dfso.model.Login;

public interface LoginRepository extends JpaRepository<Login,Long>{
	
	@Query("SELECT s FROM Login s WHERE s.statename = :statename AND s.mobileno = :mobileno")
    List<Login> findByStateAndMobileNumber(@Param("statename") String state, @Param("mobileno") String mobileno);
}
