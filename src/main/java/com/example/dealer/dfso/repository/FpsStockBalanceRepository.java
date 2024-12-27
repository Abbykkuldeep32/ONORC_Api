package com.example.dealer.dfso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.dealer.dfso.model.FpsStockBalance;

import io.lettuce.core.dynamic.annotation.Param;

public interface FpsStockBalanceRepository extends CrudRepository<FpsStockBalance,String> {

	@Query(value = """
	         SELECT commodity_name, SUM(stock_quantity) AS total_quantity
	         FROM (
	             SELECT commodity_name, opening_balance AS stock_quantity FROM onorc_fps_stock_balance
	             WHERE state_code = :statecode AND allocation_month = :allocation_month AND allocation_year = :allocation_year AND fps_code = :fpscode
	             UNION ALL
	             SELECT commodity_name, stock_recieved AS stock_quantity FROM onorc_fps_stock_mgt
	             WHERE state_code = :statecode AND allocation_month = :allocation_month AND allocation_year = :allocation_year AND fps_code = :fpscode
	         ) AS combined
	         GROUP BY commodity_name
	     """, nativeQuery = true)
		List<Object[]> getTotalStockByCommodityType(@Param("statecode") String statecode,@Param("allocation_month") String allocation_month,@Param("allocation_year") String allocation_year,@Param("fpscode") String fpscode);
}
