package com.example.dealer.service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.model.Sale;
import com.example.dealer.repository.SaleRepository;
import com.example.dealer.response.AggregatedSaleResponse;

@Service
public class SaleService {
	
	@Autowired
    private SaleRepository saleRepository;

	public AggregatedSaleResponse[] getSaleByRationCardNo(String rationCardNo, YearMonth transactionDate) {
		int year = transactionDate.getYear();
        int month = transactionDate.getMonthValue();
		
        List<Sale> sales = saleRepository.findByRationCardNoAndTransactionDate(rationCardNo, year,month);
        
        if (sales.isEmpty()) {
        	return new AggregatedSaleResponse[0]; // Or throw an exception if no data found
        }
        
        Sale sale = sales.get(0);
        
        List<AggregatedSaleResponse.CommodityDetail> commodities = sales.stream()
                .map(t -> new AggregatedSaleResponse.CommodityDetail(t.getComm_code(),t.getCommodity_name(),t.getDistributed_quanitity(),t.getEntitlement_quanitity()))
                .collect(Collectors.toList());
        
        AggregatedSaleResponse response = new AggregatedSaleResponse(
                sale.getId(),
                sale.getSale_state(),
                sale.getSale_district(),
                sale.getRationcardid(),
                sale.getTransaction_date(),
                sale.getAllocation_month(),
                sale.getAllocation_year(),
                sale.getMembername(),
                sale.getMembernamell(),
                sale.getNo_of_member(),
                sale.getCard_type(),
                sale.getTransaction_id(),
                sale.getAllocation_orderno(),
                sale.getAuth_type(),
                sale.getHome_fps_id(),
                sale.getHome_district(),
                sale.getHome_state_name(),
                sale.getTxn_type(),
                sale.getAllocation_type(),
                commodities
            );
        
        return new AggregatedSaleResponse[] { response };

	}
	
	public List<Sale> getSaleByMemberName(String membername) {
		
		return saleRepository.findByMembername(membername);
	}
}
