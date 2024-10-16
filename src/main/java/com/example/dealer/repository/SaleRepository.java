package com.example.dealer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.dealer.model.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long>{
	
	@Query(value = "SELECT * FROM onorc_sale_txn_data s WHERE s.rationcardid = :rationCardNo " +
            "AND EXTRACT(YEAR FROM s.transaction_date::date) = :year " +
            "AND EXTRACT(MONTH FROM s.transaction_date::date) = :month", 
    nativeQuery = true)
	List<Sale> findByRationCardNoAndTransactionDate(@Param("rationCardNo") String rationCardNo, @Param("year") int year, 
            @Param("month") int month);

	Sale findById(long id);
}
