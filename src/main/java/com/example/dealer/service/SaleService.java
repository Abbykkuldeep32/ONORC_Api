package com.example.dealer.service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.model.Sale;
import com.example.dealer.repository.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
    private SaleRepository saleRepository;

	public List<Sale> getSaleByRationCardNo(String rationCardNo, YearMonth transactionDate) {
		int year = transactionDate.getYear();
        int month = transactionDate.getMonthValue();
		
		return saleRepository.findByRationCardNoAndTransactionDate(rationCardNo, year,month);
	}
}
