package com.example.dealer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import com.example.dealer.repository.DealerRepository;
import com.example.dealer.response.UserRequest;
import com.example.dealer.service.DealerService;
import com.example.dealer.service.OtpService;
import com.example.dealer.service.TemporaryStoreService;
import com.example.dealer.util.JwtUtil;
import com.example.dealer.dfso.service.LoginService;
import com.example.dealer.inspector.service.InspectorService;
import com.example.dealer.model.Dealer;
import com.example.dealer.model.Otp;

@RestController
@RequestMapping("/public/api/v1/")
public class DealerController {
	
	@Autowired
	DealerRepository dealerrepository;
	
	@Autowired
	DealerService dealerservice;
	
	@Autowired
	LoginService loginservice;
	
	@Autowired
	InspectorService inspectorservice;
	
	@Autowired
	OtpService otpService;
	
	@Autowired
    JwtUtil jwtUtil;
	
	@Autowired
	TemporaryStoreService tempStoreService;
	
	@Autowired
    RedisTemplate<String, String> redisTemplate;
	
	
	
	@PostMapping("/dealer")
	public ResponseEntity<Object> authenticateUser(
			@RequestBody UserRequest userRequest){
		List<?> entityData = null;
        String role = userRequest.getRole();
        
        if ("DEALER".equalsIgnoreCase(role)) {
            entityData = dealerservice.getDealerByFpsid(userRequest.getStatename(), userRequest.getMobileno());
        } else if ("DFSO".equalsIgnoreCase(role)) {
            entityData = loginservice.getDfsoByMobile(userRequest.getStatename(), userRequest.getMobileno());
        }else if ("INSPECTOR".equalsIgnoreCase(role)) {
            entityData = inspectorservice.getInspectorByMobile(userRequest.getStatename(), userRequest.getMobileno());
        }
        
        
        if (entityData  != null && !entityData.isEmpty()) {
        	String otp = otpService.generateOtp();
        	otpService.sendOtp(userRequest.getMobileno(), otp);
        	otpService.storeOtp(userRequest.getMobileno(), otp);
        	
        	tempStoreService.storeFpsData(userRequest.getMobileno(), entityData, role);
        	
        	Map<String, Object> response = new HashMap<>();
            response.put("status", true);
            response.put("message", "OTP sent to registered mobile number");
        	return ResponseEntity.ok(response);
        } else {
        	Map<String, Object> response = new HashMap<>();
            response.put("status", false); 
            response.put("message", "User does not exist"); 

            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
    }
	
	
	@PostMapping("/dealer/verify-otp")
	public ResponseEntity<Object> verifyOtp(
	        @RequestBody Otp otpRequest)
	        {

	    // Verify OTP
	    boolean isOtpValid = otpService.verifyOtp(otpRequest.getMobileNo(), otpRequest.getOtp());
	    
	    if (isOtpValid) {
	    	Map<String, Object> storedData = tempStoreService.getFpsData(otpRequest.getMobileNo());
	        List<?> entityData = (List<?>) storedData.get("data");
	        String role = (String) storedData.get("role");
	    	String token = jwtUtil.generateToken(otpRequest.getMobileNo());
	        Map<String, Object> response = new HashMap<>();
	        response.put("status", true);
	        response.put("message", "OTP verified successfully");
	        response.put("token", token);
	        response.put("data", entityData);
	        response.put("role", role);
	        tempStoreService.clearFpsData(otpRequest.getMobileNo());
	        return ResponseEntity.ok(response);
	        
	    } else {
	        Map<String, Object> response = new HashMap<>();
	        response.put("status", false);
	        response.put("message", "Invalid OTP");
	        return ResponseEntity.status(HttpStatus.OK).body(response);
	    }
	}
	
	@PostMapping("/logout")
	public ResponseEntity<String> logout(@RequestHeader("Authorization") String token) {
        // Optionally, you might want to extract the token from the Bearer prefix
        String jwtToken = token.substring(7); // Remove "Bearer " from the token

        redisTemplate.opsForValue().set(jwtToken, "invalid", 3600, TimeUnit.SECONDS); // Set an expiration time for the invalidation

        return ResponseEntity.ok("Logged out successfully");
    }
	
	@GetMapping("/test-redis")
    public String testRedisConnection() {
        try {
            redisTemplate.opsForValue().set("testKey", "testValue");
            String value = redisTemplate.opsForValue().get("testKey");
            return "Redis is working! Value: " + value;
        } catch (Exception e) {
            return "Error connecting to Redis: " + e.getMessage();
        }
    }
}
