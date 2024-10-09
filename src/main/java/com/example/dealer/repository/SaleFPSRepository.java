package com.example.dealer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dealer.model.SaleFPS;

@Repository
public interface SaleFPSRepository extends JpaRepository<SaleFPS,Long> {

	List<SaleFPS> findByFpsid(String fpsid);

}
