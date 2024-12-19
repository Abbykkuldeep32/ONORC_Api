package com.example.dealer.dfso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.dfso.model.FPSJuridiction;
import com.example.dealer.dfso.service.FPSJuridictionService;

@RestController
@RequestMapping("/api/v1/dfso")
public class FPSJuridictionController {
	
	@Autowired
	FPSJuridictionService fpsjuridictionService;
	
	@PostMapping("/fps")
    public ResponseEntity<List<FPSJuridiction>> getFPSByState(
    		@RequestBody FPSJuridiction fpsJuridiction){
    	List<FPSJuridiction> fps= fpsjuridictionService.getFPSByState(fpsJuridiction.getStatecode(), fpsJuridiction.getDfsocode());
        
        if (fps != null) {
        	return ResponseEntity.ok(fps);
        } else {
            return ResponseEntity.notFound().build(); // Return 404 if not found
        }
    }
	
}
