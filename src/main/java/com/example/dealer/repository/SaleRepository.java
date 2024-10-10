package com.example.dealer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dealer.model.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long>{
	
	List<Sale> findByRationCardNo(String rationCardNo);

}
