package com.example.dealer.dfso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.dealer.dfso.model.FPSJuridiction;

public interface FPSJuridictionRepository extends JpaRepository<FPSJuridiction,String> {
	
	@Query("SELECT s FROM FPSJuridiction s WHERE s.statecode = :statecode AND s.dfsocode = :dfsocode")
	List<FPSJuridiction> findFpsByStateCodeAndDFSOCode(@Param("statecode") String statecode, @Param("dfsocode") String dfsocode);
}
