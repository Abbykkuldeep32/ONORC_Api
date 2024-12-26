package com.example.dealer.dfso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.dfso.model.InspectorDFSO;
import com.example.dealer.dfso.repository.InspectorDFSORepository;

@Service
public class InspectorDFSOService {

	@Autowired
	private InspectorDFSORepository inspectordfsoRepository;
	
	public List<InspectorDFSO> getInspectorByDFSOCode(String statecode, String dfsocode) {
			
			return inspectordfsoRepository.findInspectorByStatecodeAndDfsocode(statecode,dfsocode);
		}
}
