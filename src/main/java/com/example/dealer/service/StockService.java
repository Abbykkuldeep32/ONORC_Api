package com.example.dealer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.model.Stock;
import com.example.dealer.repository.StockRepository;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Service
public class StockService {
	
	@Autowired
    private StockRepository stockRepository;

    public List<Stock> getStockByFpsidDateAndTime(Long fpsid, String stockDate, String stockTime) {
        return stockRepository.findByFpsidAndStockDateAndStockTime(fpsid, stockDate, stockTime);
    }
	
}
