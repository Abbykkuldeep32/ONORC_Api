package com.example.dealer.dfso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dealer.dfso.model.InspectorDFSO;

public interface InspectorDFSORepository extends JpaRepository<InspectorDFSO,String> {
	
	List<InspectorDFSO> findInspectorByStatecodeAndDfsocode(String statecode, String dfsocode);

}
