package com.example.dealer.service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.model.SaleFPS;
import com.example.dealer.repository.SaleFPSRepository;
import com.example.dealer.response.AggregatedSaleResponseTwo;

@Service
public class SaleFPSService {
	
	@Autowired
    private SaleFPSRepository salefpsRepository;

	public List<AggregatedSaleResponseTwo> getStockByFpsid(String fpsid, LocalDate transactionDate) {
		
		List<SaleFPS> sales = salefpsRepository.findByFpsidAndTransactionDate(fpsid, transactionDate);
		
		if (sales.isEmpty()) {
	        return Collections.emptyList(); // Return an empty list if no data is found
	    }
		
		// Calculate total wheat sale for all ration cards
	    double totalWheatSale = getTotalWheatSale(sales);
	    double totalRiceSale = getTotalRiceSale(sales);
		
		Map<String, List<SaleFPS>> groupedByRationCardNo = sales.stream()
	            .collect(Collectors.groupingBy(SaleFPS::getRationcardid));
		
		List<AggregatedSaleResponseTwo> responseList = groupedByRationCardNo.entrySet().stream()
	            .map(entry -> {
	                // Get the first SaleFPS entry as the base entry for each ration card
	                SaleFPS baseSale = entry.getValue().get(0);

	                // Collect all commodities across entries with the same rationCardId
	                List<AggregatedSaleResponseTwo.CommodityDetailTwo> commodities = entry.getValue().stream()
	                        .map(sale -> new AggregatedSaleResponseTwo.CommodityDetailTwo(
	                                sale.getComm_code(),
	                                sale.getCommodity_name(),
	                                sale.getDistributed_quantity(),
	                                sale.getEntitlement_quantity()))
	                        .collect(Collectors.toList());
	                
	             // Sum the distributed quantities for wheat and rice
	                double totalDistributedQuantity = entry.getValue().stream()
	                        .filter(sale -> "wheat".equalsIgnoreCase(sale.getCommodity_name()) || 
	                                        "rice".equalsIgnoreCase(sale.getCommodity_name()))
	                        .mapToDouble(sale -> Double.parseDouble(sale.getDistributed_quantity()))
	                        .sum();
	                
	                // Create AggregatedSaleResponseTwo with the combined commodities
	                AggregatedSaleResponseTwo response = new AggregatedSaleResponseTwo(
	                        baseSale.getId(),
	                        baseSale.getSale_state(),
	                        baseSale.getSale_district(),
	                        baseSale.getRationcardid(),
	                        baseSale.getFpsid(),
	                        baseSale.getTransaction_date(),
	                        baseSale.getAllocation_month(),
	                        baseSale.getAllocation_year(),
	                        baseSale.getMembername(),
	                        baseSale.getMembernameII(),
	                        baseSale.getNo_of_member(),
	                        baseSale.getCard_type(),
	                        baseSale.getTransaction_id(),
	                        baseSale.getAllocation_orderno(),
	                        baseSale.getAuth_type(),
	                        baseSale.getHome_fps_id(),
	                        baseSale.getHome_district(),
	                        baseSale.getHome_state_name(),
	                        baseSale.getTxn_type(),
	                        baseSale.getAllocation_type(),
	                        commodities,
	                        totalWheatSale,
	                        totalRiceSale
	                );
	                
	                response.setTotalDistributedQuantity(totalDistributedQuantity);

	                return response;
	                
	            })
	            .collect(Collectors.toList());
		//System.out.println("Total Wheat Sale across all Ration Cards: " + totalWheatSale);
	    return responseList;
	}
	
	private double getTotalRiceSale(List<SaleFPS> sales) {
		return sales.stream()
	            .filter(sale -> "rice".equalsIgnoreCase(sale.getCommodity_name())) // Filter only rice
	            .mapToDouble(sale -> Double.parseDouble(sale.getDistributed_quantity())) // Convert to double and sum
	            .sum();
	}

	private double getTotalWheatSale(List<SaleFPS> sales) {
		return sales.stream()
	            .filter(sale -> "wheat".equalsIgnoreCase(sale.getCommodity_name())) // Filter only wheat
	            .mapToDouble(sale -> Double.parseDouble(sale.getDistributed_quantity())) // Convert to double and sum
	            .sum();
	}

	public List<SaleFPS> getStockByRationCardNo(String fpsid, String rationcardid) {
		
		return salefpsRepository.findFirstByFpsidAndRationcardid(fpsid, rationcardid);
	}
	
}
