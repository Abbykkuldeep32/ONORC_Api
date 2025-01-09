package com.example.dealer.dfso.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.dfso.model.FpsStockMgt;
import com.example.dealer.dfso.service.StockCaseService;
import com.example.dealer.dfso.service.StockService;

@RestController
@RequestMapping("/api/v1/stock")
public class StockCaseController {
	
	@Autowired
    private StockCaseService stockcaseService;

    @PostMapping("/Reciept")
    public List<FpsStockMgt> getStockReceipt(@RequestBody FpsStockMgt fpsstock) {
        return stockcaseService.getStockReceipt(fpsstock.getStatecode(),fpsstock.getAllocation_month(),fpsstock.getAllocation_year(),fpsstock.getFpscode());
    }

}
