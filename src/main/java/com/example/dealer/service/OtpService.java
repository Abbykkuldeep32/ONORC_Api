package com.example.dealer.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.model.Otp;
import com.example.dealer.repository.OtpRepository;

@Service
public class OtpService {
	 	
		@Autowired
	    private OtpRepository otpRepository;

	    public String generateOtp() {
	        // Generate a 6-digit OTP
	        return String.valueOf((int) (Math.random() * 9000) + 1000);
	    }

	    public void sendOtp(String mobileNo, String otp) {
	        // Logic to send OTP via SMS
	        System.out.println("Sending OTP " + otp + " to mobile: " + mobileNo);
	    }

	    public void storeOtp(String mobileNo, String otp) {
	        // Create a new OTP entity
	        Otp otpEntity = new Otp();
	        otpEntity.setMobileNo(mobileNo);
	        otpEntity.setOtp(otp);
	        otpEntity.setCreatedAt(LocalDateTime.now());

	        // Save the OTP entity to the database
	        otpRepository.save(otpEntity);
	    }

	    public boolean verifyOtp(String mobileNo, String otp) {
	        // Fetch the OTP record for this mobile number and verify the OTP
	        Optional<Otp> otpRecord = otpRepository.findByMobileNoAndOtp(mobileNo, otp);
	        
	        // Check if OTP is valid (exists and not expired)
	        return otpRecord.isPresent() && !isOtpExpired(otpRecord.get().getCreatedAt());
	    }

	    private boolean isOtpExpired(LocalDateTime createdAt) {
	        // Define OTP expiration time (e.g., 5 minutes)
	        return createdAt.isBefore(LocalDateTime.now().minusMinutes(5));
	    }
}
