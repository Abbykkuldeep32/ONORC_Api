package com.example.dealer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.dealer.model.Dealer;


public interface DealerRepository extends JpaRepository<Dealer,Long> {

	@Query("SELECT s FROM Dealer s WHERE s.state = :state AND s.adhaar_no = :adhaar_no")
    List<Dealer> findByStateAndAadhaarNumber(@Param("state") String state, @Param("adhaar_no") String adhaar_no);
}
