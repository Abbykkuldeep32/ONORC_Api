package com.example.dealer.dfso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.dfso.model.FPSJuridiction;
import com.example.dealer.dfso.repository.FPSJuridictionRepository;

@Service
public class FPSJuridictionService {
	
	@Autowired
	FPSJuridictionRepository fpsjuridictionRepository;
	
	public List<FPSJuridiction> getFPSByState(String statecode, String dfsocode) {
		
		return fpsjuridictionRepository.findFpsByStateCodeAndDFSOCode(statecode, dfsocode);
	}
}
