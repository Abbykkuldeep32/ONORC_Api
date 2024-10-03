package com.example.dealer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Dealer")
public class Dealer {
	
	@Id
	@Column(name="dealer_id")
	private String dealer_id;
	
	@Column(name="dealer_name")
	private String dealer_name;
	
	@Column(name="shop_address")
	private String shop_address;
	
	@Column(name="shop_category")
	private String shop_category;

	public String getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(String dealer_id) {
		this.dealer_id = dealer_id;
	}

	public String getDealer_name() {
		return dealer_name;
	}

	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}

	public String getShop_address() {
		return shop_address;
	}

	public void setShop_address(String shop_address) {
		this.shop_address = shop_address;
	}

	public String getShop_category() {
		return shop_category;
	}

	public void setShop_category(String shop_category) {
		this.shop_category = shop_category;
	}

	public Dealer(String dealer_id, String dealer_name, String shop_address, String shop_category) {
		super();
		this.dealer_id = dealer_id;
		this.dealer_name = dealer_name;
		this.shop_address = shop_address;
		this.shop_category = shop_category;
	}
	
	public Dealer() {
		
	}

	@Override
	public String toString() {
		return "Dealer [dealer_id=" + dealer_id + ", dealer_name=" + dealer_name + ", shop_address=" + shop_address
				+ ", shop_category=" + shop_category + "]";
	}
	
	
	
	
}
