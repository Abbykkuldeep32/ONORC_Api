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

	public AggregatedSaleResponse getSaleByRationCardNo(String rationCardNo, YearMonth transactionDate) {
		int year = transactionDate.getYear();
        int month = transactionDate.getMonthValue();
		
        List<Sale> sale = saleRepository.findByRationCardNoAndTransactionDate(rationCardNo, year,month);
        
        if (sale.isEmpty()) {
            return null; // Or throw an exception if no data found
        }

        // Assuming all records with the same transactionId share common fields like date
        Long id = sale.get(0).getId();
        String sale_state = sale.get(0).getSale_state();
        String sale_district = sale.get(0).getSale_district();
        String ration = sale.get(0).getRationcardid();
        LocalDate transaction = sale.get(0).getTransaction_date();
        String allocation_month = sale.get(0).getAllocation_month();
        String allocation_year = sale.get(0).getAllocation_year();
        String membername = sale.get(0).getMembername();
        String membernamell = sale.get(0).getMembernamell();
        String no_of_member = sale.get(0).getNo_of_member();
        String card_type = sale.get(0).getCard_type();
        String transaction_id = sale.get(0).getTransaction_id();
        String allocation_orderno = sale.get(0).getAllocation_orderno();
        String auth_type = sale.get(0).getAuth_type();
        String home_fps_id = sale.get(0).getHome_fps_id();
        String home_district = sale.get(0).getHome_district();
        String home_state_name = sale.get(0).getHome_state_name();
        String txn_type = sale.get(0).getTxn_type();
        String allocation_type = sale.get(0).getAllocation_type();
        
        List<AggregatedSaleResponse.CommodityDetail> commodities = sale.stream()
                .map(t -> new AggregatedSaleResponse.CommodityDetail(t.getComm_code(),t.getCommodity_name(),t.getDistributed_quanitity(),t.getEntitlement_quanitity()))
                .collect(Collectors.toList());

        return new AggregatedSaleResponse(id,sale_state,sale_district,ration,transaction,allocation_month,allocation_year,membername,membernamell,no_of_member,card_type,transaction_id,allocation_orderno,auth_type,home_fps_id,home_district,home_state_name,txn_type,allocation_type, commodities);
	}
	
	public List<Sale> getSaleByMemberName(String membername) {
		
		return saleRepository.findByMembername(membername);
	}
}
