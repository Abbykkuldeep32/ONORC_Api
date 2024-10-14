package com.example.dealer.controller;

import java.util.List;

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
import com.example.dealer.model.SaleFPS;
import com.example.dealer.repository.CordinatesRepository;
import com.example.dealer.service.CordinatesService;
import com.example.dealer.service.SaleFPSService;

@RestController
@RequestMapping("/api/v1/cordinates")
public class CordinatesController {
	
	@Autowired
    private CordinatesRepository cordinatesRepository;
	
	@Autowired
    private CordinatesService cordinatesService;
    

    @PostMapping("/save")
    public ResponseEntity<Cordinates> saveCordinates(@RequestBody Cordinates cordinates) {
        Cordinates savedCordinates = cordinatesRepository.save(cordinates);
        return new ResponseEntity<>(savedCordinates, HttpStatus.CREATED);
    }
    
    @GetMapping("/{fpsid}")
    public ResponseEntity<List<Cordinates>> getCordinatesByFpsid(
    		@PathVariable String fpsid){
    	List<Cordinates> cordinates= cordinatesService.getCordinatesByFpsid(fpsid);
        
        if (cordinates != null) {
        	return ResponseEntity.ok(cordinates);
        } else {
            return ResponseEntity.notFound().build(); // Return 404 if not found
        }
    }

}
