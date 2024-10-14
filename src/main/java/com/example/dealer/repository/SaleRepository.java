package com.example.dealer.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.dealer.model.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long>{
	
	@Query(value = "SELECT * FROM sale_fps s WHERE s.rationCardNo = :rationCardNo " +
            "AND EXTRACT(YEAR FROM s.transaction_date::date) = EXTRACT(YEAR FROM CAST(:transactionDate AS DATE)) " +
            "AND EXTRACT(MONTH FROM s.transaction_date::date) = EXTRACT(MONTH FROM CAST(:transactionDate AS DATE))", 
    nativeQuery = true)
	List<Sale> findByRationCardNoAndTransactionDate(@Param("rationCardNo") String rationCardNo, @Param("transactionDate") LocalDate transactionDate);

}
