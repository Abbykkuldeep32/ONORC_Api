package com.example.dealer.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dealer.model.Otp;
import java.util.Optional;

public interface OtpRepository extends JpaRepository<Otp, Long>{
	
	    Optional<Otp> findByMobileNoAndOtp(String mobileNo, String otp);
	    
}
