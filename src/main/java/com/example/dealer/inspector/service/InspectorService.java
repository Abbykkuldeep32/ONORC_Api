package com.example.dealer.inspector.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.inspector.model.InspectorLogin;
import com.example.dealer.inspector.repository.InspectorRepository;

@Service
public class InspectorService {

	@Autowired
    private InspectorRepository inspectorRepository;

	public List<InspectorLogin> getInspectorByMobile(String statename, String mobileno) {
		
		return inspectorRepository.findByStateAndMobileNumber(statename, mobileno);
	}
}
