package com.example.dealer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dealer.model.Mpin;
import java.util.Optional;

public interface MpinRepository extends JpaRepository<Mpin, Long>{
	
	Optional<Mpin> findByMobileNo(String mobileNo);
	
	Optional<Mpin> findByDevice(String device);
	
	Optional<Mpin> findByMpinAndDevice(String Mpin,String device);
	
}
