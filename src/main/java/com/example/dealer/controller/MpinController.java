package com.example.dealer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.model.Mpin;
import com.example.dealer.response.SaveResponse;
import com.example.dealer.service.MpinService;

@RestController
@RequestMapping("/api/v1/")
public class MpinController {
	
	@Autowired
    MpinService mpinService;
	
	@PostMapping("/saveMpin")
    public SaveResponse saveMpin(@RequestBody Mpin mpin) {
        return mpinService.saveMpinIfMobileDoesNotExist(mpin.getMobileNo(), mpin.getMpin(), mpin.getDevice());
    }
	
	
}
