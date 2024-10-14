package com.example.dealer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dealer.model.Grievance;

public interface GrievanceRepository extends JpaRepository<Grievance, Long> {

}
