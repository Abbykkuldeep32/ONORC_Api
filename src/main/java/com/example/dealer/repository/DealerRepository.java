package com.example.dealer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dealer.model.Dealer;

public interface DealerRepository extends JpaRepository<Dealer,String> {
	
}
