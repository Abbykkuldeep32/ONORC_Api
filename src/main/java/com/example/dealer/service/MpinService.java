package com.example.dealer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.model.Mpin;
import com.example.dealer.repository.MpinRepository;

import java.time.LocalDateTime;
import java.util.Optional;
import com.example.dealer.response.SaveResponse;

@Service
public class MpinService {
	
	@Autowired
    MpinRepository mpinRepository;
	
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
}
