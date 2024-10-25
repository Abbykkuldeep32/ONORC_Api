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
public class Rating10 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rating_id")
	private Short id;
	
	@Column(name="star")
	private Short star;
	
	@Column(name="fps_id")
	private String fpsid;
	
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

	public Short getStar() {
		return star;
	}

	public void setStar(Short star) {
		this.star = star;
	}

	public String getFpsid() {
		return fpsid;
	}

	public void setFpsid(String fpsid) {
		this.fpsid = fpsid;
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

	public Rating10(Short id, Short star, String fpsid, Long state_code, String district_code) {
		super();
		this.id = id;
		this.star = star;
		this.fpsid = fpsid;
		this.state_code = state_code;
		this.district_code = district_code;
	}

	public Rating10() {
		
	}
}
