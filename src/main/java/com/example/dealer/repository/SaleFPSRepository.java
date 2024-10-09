package com.example.dealer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.dealer.model.SaleFPS;

@Repository
public interface SaleFPSRepository extends JpaRepository<SaleFPS,Long> {

	@Query("SELECT s FROM SaleFPS s WHERE s.fpsid = :fpsid AND DATE(s.transactionDate) = DATE(:transactionDate)")
    List<SaleFPS> findByFpsidAndTransactionDate(@Param("fpsid") String fpsid, @Param("transactionDate") String transactionDate);

}
