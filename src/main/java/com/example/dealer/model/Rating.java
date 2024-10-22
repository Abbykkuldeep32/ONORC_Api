package com.example.dealer.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_rating")
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rating_id")
	private Short id;
	
	@Column(name="user_id")
	private String user_id;
	
	@Column(name="star")
	private Short star;
	
	@Column(name="message")
	private String message;
	
	@Column(name="fps_id")
	private String fpsid;
	
	@Column(name="transaction_id")
	private String transaction_id;
	
	@Column(name="created_at")
	private Date created_at;
	
	@Column(name="state_code")
	private Long state_code;
	
	@Column(name="district_code")
	private String district_code;

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Short getStar() {
		return star;
	}

	public void setStar(Short star) {
		this.star = star;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFpsid() {
		return fpsid;
	}

	public void setFpsid(String fpsid) {
		this.fpsid = fpsid;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Long getState_code() {
		return state_code;
	}

	public void setState_code(Long state_code) {
		this.state_code = state_code;
	}

	public String getDistrict_code() {
		return district_code;
	}

	public void setDistrict_code(String district_code) {
		this.district_code = district_code;
	}

	public Rating(Short id, String user_id, Short star, String message, String fpsid, String transaction_id,
			Date created_at, Long state_code, String district_code) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.star = star;
		this.message = message;
		this.fpsid = fpsid;
		this.transaction_id = transaction_id;
		this.created_at = created_at;
		this.state_code = state_code;
		this.district_code = district_code;
	}
	
	public Rating() {
		
	}
}
