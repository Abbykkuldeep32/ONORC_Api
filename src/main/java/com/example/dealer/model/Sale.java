package com.example.dealer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sale_dealer")
public class Sale {
	@Id
	@Column(name="dealer_id")
	private String dealer_id;
	
	@Column(name="ration_card_no")
	private String ration_card_no;
	
	@Column(name="month")
	private String month;
	
	@Column(name="yearr")
	private String yearr;
	
	@Column(name="commodity_wheat")
	private int commodity_wheat;
	
	@Column(name="commodity_rice")
	private int commodity_rice;
	
	@Column(name="total_commodity")
	private int total_commodity;

	public String getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(String dealer_id) {
		this.dealer_id = dealer_id;
	}

	public String getRation_card_no() {
		return ration_card_no;
	}

	public void setRation_card_no(String ration_card_no) {
		this.ration_card_no = ration_card_no;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYearr() {
		return yearr;
	}

	public void setYearr(String yearr) {
		this.yearr = yearr;
	}

	public int getCommodity_wheat() {
		return commodity_wheat;
	}

	public void setCommodity_wheat(int commodity_wheat) {
		this.commodity_wheat = commodity_wheat;
	}

	public int getCommodity_rice() {
		return commodity_rice;
	}

	public void setCommodity_rice(int commodity_rice) {
		this.commodity_rice = commodity_rice;
	}

	public int getTotal_commodity() {
		return total_commodity;
	}

	public void setTotal_commodity(int total_commodity) {
		this.total_commodity = total_commodity;
	}

	public Sale(String dealer_id, String ration_card_no, String month, String yearr, int commodity_wheat,
			int commodity_rice, int total_commodity) {
		super();
		this.dealer_id = dealer_id;
		this.ration_card_no = ration_card_no;
		this.month = month;
		this.yearr = yearr;
		this.commodity_wheat = commodity_wheat;
		this.commodity_rice = commodity_rice;
		this.total_commodity = total_commodity;
	}
	
	public Sale() {
		
	}

	@Override
	public String toString() {
		return "Sale [dealer_id=" + dealer_id + ", ration_card_no=" + ration_card_no + ", month=" + month + ", yearr="
				+ yearr + ", commodity_wheat=" + commodity_wheat + ", commodity_rice=" + commodity_rice
				+ ", total_commodity=" + total_commodity + "]";
	}
	
	

}
