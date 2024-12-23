package com.example.dealer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.model.Grievance;
import com.example.dealer.repository.GrievanceRepository;

import com.example.dealer.response.SaveResponse;
import com.example.dealer.service.GrievanceService;

@RestController
@RequestMapping("/api/v1/grievance")
public class GrievanceController {
	@Autowired
    private GrievanceRepository grievanceRepository;
	
	@Autowired
	private GrievanceService grievanceService;
	
	@PostMapping("/save")
    public ResponseEntity<SaveResponse> saveCordinates(@RequestBody Grievance grievance) {
		try {
		grievance.setGrievancenumber("TEMP");
		Grievance temporaryGrievance = grievanceRepository.save(grievance);
		String grievanceNumber = generateGrievanceNumber(temporaryGrievance.getId());
		grievance.setGrievancenumber(grievanceNumber);
		Grievance savedGrievance = grievanceRepository.save(grievance);
		String message = "Grievance saved successfully with number: " + savedGrievance.getGrievancenumber();
	    SaveResponse response = new SaveResponse(true,message);
        
        return new ResponseEntity<>(response, HttpStatus.CREATED);
		}catch (Exception e) {
			
			String errorMessage = "Failed to save grievance.";
			SaveResponse response = new SaveResponse(false,errorMessage);
	        return new ResponseEntity<>(response, HttpStatus.OK);
		}
    }
	
	private String generateGrievanceNumber(Long id) {
	    return "ONORC-" + String.format("%05d", id);
	}
	
	@PostMapping("/get")
	public List<Grievance> getGrievances(@RequestBody Grievance grievance){
		return grievanceService.getGrievancesByStateAndDistrict(grievance.getState_name(),grievance.getDistrict_name());
		
	}
	
}
