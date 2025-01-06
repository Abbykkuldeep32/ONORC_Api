package com.example.dealer.dfso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dealer.inspector.model.InspectorLogin;
import com.example.dealer.inspector.service.InspectorService;

@RestController
@RequestMapping("/api/v1/")
public class InspectorLoginByNameController {

	@Autowired
	InspectorService inspectorservice;
	
	@PostMapping("/inspector/login")
	public ResponseEntity<List<InspectorLogin>> getInspectorByName(
    		@RequestBody InspectorLogin inspectorlogin){
    	List<InspectorLogin> inslog= inspectorservice.getInspectorByName(inspectorlogin.getInspectorname());
        
        if (inslog != null) {
        	return ResponseEntity.ok(inslog);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
