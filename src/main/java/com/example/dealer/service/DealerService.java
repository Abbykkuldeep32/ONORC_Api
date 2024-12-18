package com.example.dealer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.model.Dealer;
import com.example.dealer.repository.DealerRepository;


@Service
public class DealerService {
	@Autowired
    private DealerRepository dealerRepository;

	public List<Dealer> getDealerByFpsid(String statename, String mobileno) {
		
		return dealerRepository.findByStateAndMobileNumber(statename, mobileno);
	}
}
