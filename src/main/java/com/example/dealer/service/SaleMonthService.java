package com.example.dealer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.dealer.model.SaleMonth;
import com.example.dealer.repository.SaleMonthRepository;

@Service
public class SaleMonthService {
	@Autowired
    private SaleMonthRepository salemonthRepository;
	
	public List<SaleMonth> getSaleByFpsidAndMonth(String fps_id, int allocation_month, int allocation_year) {
		
		return salemonthRepository.findByFpsIdAndAllocationMonthAndAllocationYear(fps_id, allocation_month,allocation_year);
	}
}
