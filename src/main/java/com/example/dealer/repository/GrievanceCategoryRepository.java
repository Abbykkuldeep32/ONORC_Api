package com.example.dealer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dealer.model.GrievanceCategory;

public interface GrievanceCategoryRepository extends JpaRepository<GrievanceCategory,Long> {

}
