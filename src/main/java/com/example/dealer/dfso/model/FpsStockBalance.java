package com.example.dealer.dfso.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "onorc_fps_stock_balance")
public class FpsStockBalance {
	@Id
	@Column(name="fps_code")
	private String fpscode;
	
	@Column(name="state_code")
	private String statecode;
	
	@Column(name="state_name")
	private String statename;
	
	@Column(name="fps_name")
	private String fpsname;
	
	@Column(name="allocation_month")
	private String allocation_month;
	
	@Column(name="allocation_year")
	private String allocation_year;
	
	@Column(name="allocation_type")
	private String allocation_type;
	
	@Column(name="comm_code")
	private String comm_code;
	
	@Column(name="commodity_name")
	private String commodity_name;
	
	@Column(name="opening_balance")
	private Double opening_balance;
	
	@Column(name="created_on")
	private Date created_on;

	public String getFpscode() {
		return fpscode;
	}

	public void setFpscode(String fpscode) {
		this.fpscode = fpscode;
	}

	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getFpsname() {
		return fpsname;
	}

	public void setFpsname(String fpsname) {
		this.fpsname = fpsname;
	}

	public String getAllocation_month() {
		return allocation_month;
	}

	public void setAllocation_month(String allocation_month) {
		this.allocation_month = allocation_month;
	}

	public String getAllocation_year() {
		return allocation_year;
	}

	public void setAllocation_year(String allocation_year) {
		this.allocation_year = allocation_year;
	}

	public String getAllocation_type() {
		return allocation_type;
	}

	public void setAllocation_type(String allocation_type) {
		this.allocation_type = allocation_type;
	}

	public String getComm_code() {
		return comm_code;
	}

	public void setComm_code(String comm_code) {
		this.comm_code = comm_code;
	}

	public String getCommodity_name() {
		return commodity_name;
	}

	public void setCommodity_name(String commodity_name) {
		this.commodity_name = commodity_name;
	}

	public Double getOpening_balance() {
		return opening_balance;
	}

	public void setOpening_balance(Double opening_balance) {
		this.opening_balance = opening_balance;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public FpsStockBalance(String fpscode, String statecode, String statename, String fpsname, String allocation_month,
			String allocation_year, String allocation_type, String comm_code, String commodity_name,
			Double opening_balance, Date created_on) {
		super();
		this.fpscode = fpscode;
		this.statecode = statecode;
		this.statename = statename;
		this.fpsname = fpsname;
		this.allocation_month = allocation_month;
		this.allocation_year = allocation_year;
		this.allocation_type = allocation_type;
		this.comm_code = comm_code;
		this.commodity_name = commodity_name;
		this.opening_balance = opening_balance;
		this.created_on = created_on;
	}

	public FpsStockBalance() {
		
	}
	
	
}
