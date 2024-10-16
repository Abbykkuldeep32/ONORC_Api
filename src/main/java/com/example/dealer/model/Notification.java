package com.example.dealer.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="onorc_fps_notification")
public class Notification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="created_date")
	private Date created_date;
	
	@Column(name="notification_role")
	private String notification_role;
	
	@Column(name="created_by")
	private String created_by;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public String getNotification_role() {
		return notification_role;
	}

	public void setNotification_role(String notification_role) {
		this.notification_role = notification_role;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Notification(Long id, String title, String description, Date created_date, String notification_role,
			String created_by) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.created_date = created_date;
		this.notification_role = notification_role;
		this.created_by = created_by;
	}
	
	public Notification() {
		
	}
}
