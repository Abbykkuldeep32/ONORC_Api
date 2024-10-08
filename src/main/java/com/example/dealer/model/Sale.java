package com.example.dealer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sale_dealer")
public class Sale {
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="dealer_id")
	private String dealer_id;
	
	@Column(name="ration_card_no")
	private String ration_card_no;
	
	@Column(name="sale_date")
	private String sale_date;
		
	@Column(name="commodity_wheat")
	private int commodity_wheat;
	
	@Column(name="commodity_rice")
	private int commodity_rice;
	
	@Column(name="total_commodity")
	private int total_commodity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getSale_date() {
		return sale_date;
	}

	public void setSale_date(String sale_date) {
		this.sale_date = sale_date;
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

	public Sale(Long id, String dealer_id, String ration_card_no, String sale_date, int commodity_wheat,
			int commodity_rice, int total_commodity) {
		super();
		this.id = id;
		this.dealer_id = dealer_id;
		this.ration_card_no = ration_card_no;
		this.sale_date = sale_date;
		this.commodity_wheat = commodity_wheat;
		this.commodity_rice = commodity_rice;
		this.total_commodity = total_commodity;
	}

	public Sale() {
		
	}
}
