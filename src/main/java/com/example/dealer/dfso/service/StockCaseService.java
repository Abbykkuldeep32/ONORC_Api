package com.example.dealer.dfso.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.dfso.model.FpsStockMgt;
import com.example.dealer.dfso.repository.StockCaseRepository;

@Service
public class StockCaseService {
	
	@Autowired
	StockCaseRepository stockcaseRepository;
	
	public List<FpsStockMgt> getStockReceipt(String statecode,String allocation_month, String allocation_year, String fpscode){
		
		return stockcaseRepository.findStockReceiptByStateCode(statecode,allocation_month,allocation_year,fpscode);
	} 
}
