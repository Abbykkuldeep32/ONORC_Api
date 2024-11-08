package com.example.dealer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.dealer.model.Dealer;
import com.example.dealer.model.Mpin;
import com.example.dealer.repository.DealerRepository;
import com.example.dealer.repository.MpinRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.example.dealer.response.LoginResponse;
import com.example.dealer.response.SaveResponse;
import com.example.dealer.util.JwtUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MpinService {
	
	@Autowired
    MpinRepository mpinRepository;
	
	@Autowired 
	DealerRepository dealerRepository;
	
	@Autowired
    JwtUtil jwtUtil;
	
	private static final Logger logger = LoggerFactory.getLogger(MpinService.class);
	
	public SaveResponse saveMpinIfMobileDoesNotExist(String mobileNo, String mpin, String device) {
		
        Optional<Mpin> existingUser = mpinRepository.findByMobileNo(mobileNo);
        
        if (existingUser.isPresent()) {
        	
        	Mpin userToUpdate = existingUser.get();
            userToUpdate.setMpin(mpin);
            userToUpdate.setDevice(device);
            userToUpdate.setUpdated_at(LocalDateTime.now());
            mpinRepository.save(userToUpdate);
        	return new SaveResponse(true, "MPIN updated successfully.");
        }

        Mpin newUser = new Mpin();
        newUser.setMobileNo(mobileNo);
        newUser.setMpin(mpin);
        newUser.setDevice(device);
        mpinRepository.save(newUser);
        return new SaveResponse(true, "MPIN saved successfully.");
    }
	

	public ResponseEntity<LoginResponse> loginMpinIfMobileDoesExist(String mobileNo, String mpin, String device) {
		
		Optional<Mpin> user = mpinRepository.findByMobileNo(mobileNo);
		
		String token = jwtUtil.generateToken(mobileNo);
		
		if(user.isPresent()) {
			Mpin existingUser = user.get();
			if (!existingUser.getMpin().equals(mpin)) {
				return ResponseEntity.ok(new LoginResponse(false, "Invalid MPIN", null, null));
	        }
		}
		
		List<Dealer> dealers = dealerRepository.findByMobileNo(mobileNo);
		
		if (dealers.isEmpty()) {
	        return ResponseEntity.ok(new LoginResponse(true, "Login successful. No dealers found for the given mobile number.", null, null));
	    }

	    return ResponseEntity.ok(new LoginResponse(true, "Login successful.", dealers, token ));
		
	}
	
	public ResponseEntity<SaveResponse> checkIfMpinDoesExist(String device) {
		
		logger.info("Checking MPIN for device: {}", device);
		
		Optional<Mpin> pin = mpinRepository.findByDevice(device);
		
		if(pin.isPresent()) {
			return ResponseEntity.ok(new SaveResponse(true, "MPIN exist"));
		}
		
		return ResponseEntity.ok(new SaveResponse(false, "No MPIN found"));
		
	}
	
	public ResponseEntity<LoginResponse> VerifyMpinByMpinAndDevice(String Mpin,String device) {
		
		Optional<Mpin> verify = mpinRepository.findByMpinAndDevice(Mpin, device);
		
		if(verify.isPresent()) {
			String mobileNo = verify.get().getMobileNo();
			String token = jwtUtil.generateToken(mobileNo);
			List<Dealer> dealers = dealerRepository.findByMobileNo(mobileNo);
			return ResponseEntity.ok(new LoginResponse(true, "MPin Verified",dealers,token));
		}
		
		return ResponseEntity.ok(new LoginResponse(false, "MPin not verified",null,null));
		
	}
	
	
}
