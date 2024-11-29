package com.example.dealer.controller;

import java.time.YearMonth;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.model.SaleMonth;
import com.example.dealer.service.SaleMonthService;


@RestController
@RequestMapping("/api/v1/salemonth")
public class SaleMonthController {
	
	@Autowired
    private SaleMonthService salemonthService;
	
	@PostMapping("/sale")
    public ResponseEntity<Map<String, Object>> getSaleByFpsidAndMonth(@RequestBody SaleMonth salemonth){
    	
    	List<SaleMonth> salesm= salemonthService.getSaleByFpsidAndMonth(salemonth.getFpsId(),salemonth.getAllocationMonth(),salemonth.getAllocationYear());
    		
    	int AayNorTxn = 0;
        int AayIntraTxn = 0;
        int AayInterTxn = 0;
        int PphNorTxn = 0;
        int PphIntraTxn = 0;
        int PphInterTxn = 0;
        int AayNorWheat = 0;
        int AayIntraWheat = 0;
        int AayInterWheat = 0;
        int AayNorRice = 0;
        int AayIntraRice = 0;
        int AayInterRice = 0;
        int PphNorWheat = 0;
        int PphIntraWheat = 0;
        int PphInterWheat = 0;
        int PphNorRice = 0;
        int PphIntraRice = 0;
        int PphInterRice = 0;
        
        for (SaleMonth sale : salesm) {
            AayNorTxn += sale.getAay_nor_txn();
            AayIntraTxn += sale.getAay_intra_txn();
            AayInterTxn += sale.getAay_inter_txn();
            PphNorTxn += sale.getPhh_nor_txn();
            PphIntraTxn += sale.getPhh_intra_txn();
            PphInterTxn += sale.getPhh_inter_txn();
            AayNorWheat += sale.getAay_nor_wheat();
            AayIntraWheat += sale.getAay_intra_wheat();
            AayInterWheat += sale.getAay_inter_wheat();
            AayNorRice += sale.getAay_nor_rice();
            AayIntraRice += sale.getAay_intra_rice();
            AayInterRice += sale.getAay_inter_rice();
            PphNorWheat += sale.getPhh_nor_rice();
            PphIntraWheat += sale.getPhh_intra_wheat();
            PphInterWheat += sale.getPhh_inter_wheat();
            PphNorRice += sale.getPhh_nor_rice();
            PphIntraRice += sale.getPhh_intra_rice();
            PphInterRice += sale.getPhh_inter_rice();
        }
        
        Map<String, Object> response = new HashMap<>();
        response.put("sales", salesm);
        response.put("totalAayTxn", AayNorTxn + AayIntraTxn + AayInterTxn);
        response.put("totalPhhTxn", PphNorTxn + PphIntraTxn + PphInterTxn);
        
        response.put("NorWheat", AayNorWheat + PphNorWheat);
        response.put("IntraWheat", AayIntraWheat + PphIntraWheat);
        response.put("InterWheat", AayInterWheat + PphInterWheat);
        response.put("NorRice", AayNorRice + PphNorRice);
        response.put("IntraRice", AayIntraRice + PphIntraRice);
        response.put("InterRice", AayInterRice + PphInterRice);
        
        response.put("TotalWheat", AayNorWheat + PphNorWheat + AayIntraWheat + PphIntraWheat + AayInterWheat + PphInterWheat);
        response.put("TotalRice", AayNorRice + PphNorRice + AayIntraRice + PphIntraRice + AayInterRice + PphInterRice);
        return ResponseEntity.ok(response);
	}

}
