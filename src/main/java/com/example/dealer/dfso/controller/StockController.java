package com.example.dealer.dfso.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.dfso.model.FpsStockBalance;
import com.example.dealer.dfso.service.StockService;
import com.example.dealer.response.StockTotals;

@RestController
@RequestMapping("/api/v1/dfso")
public class StockController {
	
	@Autowired
    private StockService stockService;

    @GetMapping("/totalStockQuantity")
    public Map<String, Object> getTotalStock(@RequestBody FpsStockBalance fpsstock) {
        return stockService.getTotalStock(fpsstock.getStatecode(),fpsstock.getAllocation_month(),fpsstock.getAllocation_year(),fpsstock.getFpscode());
    }

}
