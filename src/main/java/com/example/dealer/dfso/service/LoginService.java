package com.example.dealer.dfso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dealer.dfso.model.Login;
import com.example.dealer.dfso.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
    private LoginRepository loginRepository;

	public List<Login> getDfsoByMobile(String statename, String mobileno) {
		
		return loginRepository.findByStateAndMobileNumber(statename, mobileno);
	}
}
