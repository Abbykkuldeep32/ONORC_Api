package com.example.dealer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.model.Notification;
import com.example.dealer.repository.NotificationRepository;

@RestController
@RequestMapping("/api/v1/")
public class NotificationController {
	
	@Autowired
	NotificationRepository notificationrepository;
	
	@GetMapping("/notifications")
	public ResponseEntity<List<Notification>> getAllNotification(){
		List<Notification> notificationlist = new ArrayList<>();
		notificationrepository.findAll().forEach(notificationlist::add);
		
		if(notificationlist.isEmpty()) {
			
		}
		return new ResponseEntity<List<Notification>>(notificationlist,HttpStatus.OK);
	}
}
