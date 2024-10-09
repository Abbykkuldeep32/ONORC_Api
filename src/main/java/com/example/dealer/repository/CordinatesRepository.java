package com.example.dealer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dealer.model.Cordinates;

public interface CordinatesRepository extends JpaRepository<Cordinates,Long>{

}
