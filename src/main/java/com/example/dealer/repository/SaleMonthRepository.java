package com.example.dealer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dealer.model.SaleMonth;


public interface SaleMonthRepository extends JpaRepository<SaleMonth, Long> {
	
	List<SaleMonth> findByFpsIdAndAllocationMonthAndAllocationYear(String fps_id, int allocation_month,int allocation_year);
	
}
