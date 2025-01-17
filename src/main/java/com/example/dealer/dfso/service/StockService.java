package com.example.dealer.dfso.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.dfso.model.FpsStockBalance;
import com.example.dealer.dfso.model.FpsStockMgt;
import com.example.dealer.dfso.repository.FpsStockBalanceRepository;
import com.example.dealer.dfso.repository.FpsStockMgtRepository;
import com.example.dealer.response.StockTotals;

@Service
public class StockService {
	@Autowired
    private FpsStockBalanceRepository commodityRepository;

    public Map<String, Object> getTotalStock(String statecode,String allocation_month, String allocation_year, String fpscode) {
        List<Object[]> results = commodityRepository.getTotalStockByCommodityType(statecode,allocation_month,allocation_year,fpscode);
        Map<String, Object> totalStock = new HashMap<>();
        
        totalStock.put("statecode", statecode);
        totalStock.put("allocation_month", allocation_month);
        totalStock.put("allocation_year", allocation_year);
        totalStock.put("fpscode", fpscode);
        
        List<Map<String, Object>> stockDetails = new ArrayList<>();
        
        for (Object[] result : results) {
        	
            String commodityType = (String) result[0];
            Double totalQuantity = (Double) result[1];
            
            Map<String, Object> commodityDetail = new HashMap<>();
            commodityDetail.put("commodity_name", commodityType);
            commodityDetail.put("quantity", totalQuantity);
            
            stockDetails.add(commodityDetail);
        }
        
        totalStock.put("stock", stockDetails);
        return totalStock;
    }
}
