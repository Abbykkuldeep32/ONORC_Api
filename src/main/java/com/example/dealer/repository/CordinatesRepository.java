package com.example.dealer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.dealer.model.Cordinates;

public interface CordinatesRepository extends JpaRepository<Cordinates,Long>{

	List<Cordinates> findByFpsid(String fpsid);
}
