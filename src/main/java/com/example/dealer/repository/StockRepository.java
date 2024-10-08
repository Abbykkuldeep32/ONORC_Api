package com.example.dealer.repository;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dealer.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
	
	List<Stock> findByFpsidAndStockDateAndStockTime(Long fpsid, String stockDate, String stockTime);
}
