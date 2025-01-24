package com.example.dealer.inspector.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.inspector.model.InspectorFPS;
import com.example.dealer.inspector.service.InspectorService;

@RestController
@RequestMapping("/api/v1/")
public class InspectorFPSController {
	@Autowired
	InspectorService inspectorservice;
	
	@PostMapping("/inspector/fps")
	public ResponseEntity<List<InspectorFPS>> getFPSByInspectorCode(
    		@RequestBody InspectorFPS inspectorfps){
    	List<InspectorFPS> insfps= inspectorservice.getFPSByInspectorCode(inspectorfps.getStatecode(),inspectorfps.getInspectorcode());
        
        if (insfps != null) {
        	return ResponseEntity.ok(insfps);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
