package com.example.dealer.godown.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.godown.model.GodownLogin;
import com.example.dealer.godown.repository.GodownRepository;

@Service
public class GodownService {
	
	@Autowired
	private GodownRepository godownRepository;
	
	public List<GodownLogin> getGodownByMobile(String statename, String mobileno) {
			
			return godownRepository.findByStateAndMobileNumber(statename, mobileno);
		}
}
