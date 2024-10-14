package com.example.dealer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.model.Cordinates;
import com.example.dealer.repository.CordinatesRepository;

@Service
public class CordinatesService {
	
	@Autowired
    private CordinatesRepository cordinatesRepository;

	public List<Cordinates> getCordinatesByFpsid(String fpsid) {
		
		return cordinatesRepository.findByFpsid(fpsid);
	}

}
