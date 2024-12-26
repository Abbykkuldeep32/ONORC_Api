package com.example.dealer.dfso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.dfso.model.InspectorDFSO;
import com.example.dealer.dfso.service.InspectorDFSOService;
import com.example.dealer.model.Cordinates;

@RestController
@RequestMapping("/api/v1/dfso")
public class InspectorDFSOController {
	
	@Autowired
	private InspectorDFSOService inspectordfsoService;
	
	@PostMapping("/inspector")
    public ResponseEntity<List<InspectorDFSO>> getInspectorByDFSOCode(
    		@RequestBody InspectorDFSO inspectordfso){
    	List<InspectorDFSO> insdfso= inspectordfsoService.getInspectorByDFSOCode(inspectordfso.getStatecode(),inspectordfso.getDfsocode());
        
        if (insdfso != null) {
        	return ResponseEntity.ok(insdfso);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
