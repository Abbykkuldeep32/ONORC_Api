package com.example.dealer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dealer.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
