package com.example.dealer.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.model.SaleFPS;
import com.example.dealer.repository.SaleFPSRepository;

@Service
public class SaleFPSService {
	
	@Autowired
    private SaleFPSRepository salefpsRepository;

	public List<SaleFPS> getStockByFpsid(String fpsid, String transactionDate) {
		
		return salefpsRepository.findByFpsidAndTransactionDate(fpsid, transactionDate);
	}
	
}
