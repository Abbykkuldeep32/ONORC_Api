package com.example.dealer.model;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="fps_stock")
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="state")
	private String state;
	
	@Column(name="fpsid")
	private Long fpsid;
	
	@Column(name="stock_date")
	private String stockDate;
		
	@Column(name="stock_time")
	private String stockTime;
	
	@Column(name="stock_wheat")
	private Long stock_wheat;
	
	@Column(name="stock_rice")
	private Long stock_rice;
	
	@Column(name="stock_millet")
	private Long stock_millet;
	
	@Column(name="stock_kudo")
	private Long stock_kudo;

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public Long getFpsid() {
		return fpsid;
	}



	public void setFpsid(Long fpsid) {
		this.fpsid = fpsid;
	}



	public String getStockDate() {
		return stockDate;
	}



	public void setStockDate(String stockDate) {
		this.stockDate = stockDate;
	}



	public String getStockTime() {
		return stockTime;
	}



	public void setStockTime(String stockTime) {
		this.stockTime = stockTime;
	}



	public Long getStock_wheat() {
		return stock_wheat;
	}



	public void setStock_wheat(Long stock_wheat) {
		this.stock_wheat = stock_wheat;
	}



	public Long getStock_rice() {
		return stock_rice;
	}



	public void setStock_rice(Long stock_rice) {
		this.stock_rice = stock_rice;
	}



	public Long getStock_millet() {
		return stock_millet;
	}



	public void setStock_millet(Long stock_millet) {
		this.stock_millet = stock_millet;
	}



	public Long getStock_kudo() {
		return stock_kudo;
	}



	public void setStock_kudo(Long stock_kudo) {
		this.stock_kudo = stock_kudo;
	}

	

	public Stock(Long id, String state, Long fpsid, String stockDate, String stockTime, Long stock_wheat,
			Long stock_rice, Long stock_millet, Long stock_kudo) {
		super();
		this.id = id;
		this.state = state;
		this.fpsid = fpsid;
		this.stockDate = stockDate;
		this.stockTime = stockTime;
		this.stock_wheat = stock_wheat;
		this.stock_rice = stock_rice;
		this.stock_millet = stock_millet;
		this.stock_kudo = stock_kudo;
	}



	public Stock() {
		
	}
}
