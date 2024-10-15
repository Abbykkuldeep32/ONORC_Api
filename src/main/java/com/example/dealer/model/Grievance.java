package com.example.dealer.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="fps_grievance")
public class Grievance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="grievancenumber")
	private String grievancenumber;
	
	@Column(name="state_name")
	private String state_name;
	
	@Column(name="district_name")
	private String district_name;
	
	@Column(name="grievance_cat_id")
	private Short grievance_cat_id;
	
	@Column(name="grievance_description")
	private String grievance_description;
	
	@Column(name="is_active")
	private Short is_active;
		
	@Column(name="created_date")
	private Date created_date;
	
	@Column(name="mobile")
	private Long mobile;
	
	@Column(name="last_modified")
	private Date last_modified;

	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getGrievancenumber() {
		return grievancenumber;
	}



	public void setGrievancenumber(String grievancenumber) {
		this.grievancenumber = grievancenumber;
	}



	public String getState_name() {
		return state_name;
	}



	public void setState_name(String state_name) {
		this.state_name = state_name;
	}



	public String getDistrict_name() {
		return district_name;
	}



	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}



	public Short getGrievance_cat_id() {
		return grievance_cat_id;
	}



	public void setGrievance_cat_id(Short grievance_cat_id) {
		this.grievance_cat_id = grievance_cat_id;
	}



	public String getGrievance_description() {
		return grievance_description;
	}



	public void setGrievance_description(String grievance_description) {
		this.grievance_description = grievance_description;
	}



	public Short getIs_active() {
		return is_active;
	}



	public void setIs_active(Short is_active) {
		this.is_active = is_active;
	}



	public Date getCreated_date() {
		return created_date;
	}



	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}



	public Long getMobile() {
		return mobile;
	}



	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}



	public Date getLast_modified() {
		return last_modified;
	}



	public void setLast_modified(Date last_modified) {
		this.last_modified = last_modified;
	}


	
	public Grievance(Long id, String grievancenumber, String state_name, String district_name, Short grievance_cat_id,
			String grievance_description, Short is_active, Date created_date, Long mobile, Date last_modified) {
		super();
		this.id = id;
		this.grievancenumber = grievancenumber;
		this.state_name = state_name;
		this.district_name = district_name;
		this.grievance_cat_id = grievance_cat_id;
		this.grievance_description = grievance_description;
		this.is_active = is_active;
		this.created_date = created_date;
		this.mobile = mobile;
		this.last_modified = last_modified;
	}



	public Grievance() {
		
	}
}