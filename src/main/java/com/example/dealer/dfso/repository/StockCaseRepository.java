package com.example.dealer.dfso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dealer.dfso.model.FpsStockMgt;

public interface StockCaseRepository extends JpaRepository<FpsStockMgt,String>{

	@Query("SELECT r FROM FpsStockMgt r WHERE r.statecode = :statecode AND r.allocation_month = :allocation_month AND r.allocation_year = :allocation_year AND r.fpscode = :fpscode")
	List<FpsStockMgt> findStockReceiptByStateCode(String statecode,String allocation_month,String allocation_year,String fpscode);
}
