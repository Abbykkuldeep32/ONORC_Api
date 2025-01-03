package com.example.dealer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.model.Cordinates;
import com.example.dealer.repository.CordinatesRepository;
import com.example.dealer.response.SaveResponse;
import com.example.dealer.service.CordinatesService;

@RestController
@RequestMapping("/api/v1/cordinates")
public class CordinatesController {
	
	@Autowired
    private CordinatesRepository cordinatesRepository;
	
	@Autowired
    private CordinatesService cordinatesService;
    

    @PostMapping("/save")
    public ResponseEntity<SaveResponse> saveCordinates(@RequestBody Cordinates cordinates) {
    	try {
    		
    		List<Cordinates> existingCordinatesList = cordinatesRepository.findByFpsid(cordinates.getFpsid());
            
    		if (!existingCordinatesList.isEmpty()) {
                // Update the first existing record (or loop through if multiple records need updating)
                Cordinates updateCordinates = existingCordinatesList.get(0);
                if (cordinates.getCord_lat() != null) {
                    updateCordinates.setCord_lat(cordinates.getCord_lat());
                }
                if (cordinates.getCord_long() != null) {
                    updateCordinates.setCord_long(cordinates.getCord_long());
                }
                if (cordinates.getEastImage() != null) {
                    updateCordinates.setEastImage(cordinates.getEastImage());
                }
                if (cordinates.getWestImage() != null) {
                    updateCordinates.setWestImage(cordinates.getWestImage());
                }
                if (cordinates.getNorthImage() != null) {
                    updateCordinates.setNorthImage(cordinates.getNorthImage());
                }
                if (cordinates.getSouthImage() != null) {
                    updateCordinates.setSouthImage(cordinates.getSouthImage());
                }
                if (cordinates.getFrontImage() != null) {
                    updateCordinates.setFrontImage(cordinates.getFrontImage());
                }
                cordinates = updateCordinates; // Assign updated record to save
            }
    		
    		
        Cordinates savedCordinates = cordinatesRepository.save(cordinates);
        String message = "Cordinates saved successfully with ID: " + savedCordinates.getId();
        SaveResponse response = new SaveResponse(true,message);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		String errorMessage = "Failed to save cordinates.";
			SaveResponse response = new SaveResponse(false,errorMessage);
	        return new ResponseEntity<>(response, HttpStatus.OK);
    	}
    }
    
    @GetMapping("/{fpsid}")
    public ResponseEntity<List<Cordinates>> getCordinatesByFpsid(
    		@PathVariable String fpsid){
    	List<Cordinates> cordinates= cordinatesService.getCordinatesByFpsid(fpsid);
        
        if (cordinates != null) {
        	return ResponseEntity.ok(cordinates);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
