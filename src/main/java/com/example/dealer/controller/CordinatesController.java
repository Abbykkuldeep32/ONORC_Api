package com.example.dealer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.model.Cordinates;
import com.example.dealer.repository.CordinatesRepository;

@RestController
@RequestMapping("/api/v1/cordinates")
public class CordinatesController {
	
	@Autowired
    private CordinatesRepository cordinatesRepository;

    @PostMapping("/save")
    public ResponseEntity<Cordinates> saveCordinates(@RequestBody Cordinates cordinates) {
        Cordinates savedCordinates = cordinatesRepository.save(cordinates);
        return new ResponseEntity<>(savedCordinates, HttpStatus.CREATED);
    }

}
