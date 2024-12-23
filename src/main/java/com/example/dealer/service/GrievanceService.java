package com.example.dealer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.model.Grievance;
import com.example.dealer.model.Rating;
import com.example.dealer.repository.GrievanceRepository;

@Service
public class GrievanceService {
	
	@Autowired
	private GrievanceRepository grievanceRepository;
	
	public List<Grievance> getGrievancesByStateAndDistrict(String statename, String districtname) {
		
		return grievanceRepository.findGrievancesByStatenameAndDistrictname(statename, districtname);
	}

}
