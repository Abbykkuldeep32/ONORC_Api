package com.example.dealer.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="onorc_fps_m_category")
public class GrievanceCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="category_id")
	private Long category_id;
	
	@Column(name="category_name")
	private String category_name;
	
	@Column(name="category_description")
	private String category_description;
	
	@Column(name="created_date")
	private Date created_date;

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getCategory_description() {
		return category_description;
	}

	public void setCategory_description(String category_description) {
		this.category_description = category_description;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public GrievanceCategory(Long category_id, String category_name, String category_description, Date created_date) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.category_description = category_description;
		this.created_date = created_date;
	}
	
	public GrievanceCategory() {
		
	}
	
}
