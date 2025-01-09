package com.example.dealer.dfso.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "onorc_fps_stock_mgt")
public class FpsStockMgt {
	@Id
	@Column(name="truck_no")
	private String truck_no;
	
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
	
	@Column(name="allocation_orderno")
	private String allocation_orderno;
	
	@Column(name="release_orderno")
	private String release_orderno;
	
	@Column(name="stock_recieve_ts")
	private String stock_recieve_ts;
	
	@Column(name="truck_chitno")
	private String truck_chitno;
	
	@Column(name="reciept_id")
	private String reciept_id;
	
	@Column(name="stock_recieved")
	private Double stockrecieved;
	
	@Column(name="created_on")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date created_on;

	public String getTruck_no() {
		return truck_no;
	}

	public void setTruck_no(String truck_no) {
		this.truck_no = truck_no;
	}

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

	public String getAllocation_orderno() {
		return allocation_orderno;
	}

	public void setAllocation_orderno(String allocation_orderno) {
		this.allocation_orderno = allocation_orderno;
	}

	public String getRelease_orderno() {
		return release_orderno;
	}

	public void setRelease_orderno(String release_orderno) {
		this.release_orderno = release_orderno;
	}

	public String getStock_recieve_ts() {
		return stock_recieve_ts;
	}

	public void setStock_recieve_ts(String stock_recieve_ts) {
		this.stock_recieve_ts = stock_recieve_ts;
	}

	public String getTruck_chitno() {
		return truck_chitno;
	}

	public void setTruck_chitno(String truck_chitno) {
		this.truck_chitno = truck_chitno;
	}

	public String getReciept_id() {
		return reciept_id;
	}

	public void setReciept_id(String reciept_id) {
		this.reciept_id = reciept_id;
	}

	public Double getStockrecieved() {
		return stockrecieved;
	}

	public void setStockrecieved(Double stockrecieved) {
		this.stockrecieved = stockrecieved;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public FpsStockMgt(String truck_no, String fpscode, String statecode, String statename, String fpsname,
			String allocation_month, String allocation_year, String allocation_type, String comm_code,
			String commodity_name, String allocation_orderno, String release_orderno, String stock_recieve_ts,
			String truck_chitno, String reciept_id, Double stockrecieved, Date created_on) {
		super();
		this.truck_no = truck_no;
		this.fpscode = fpscode;
		this.statecode = statecode;
		this.statename = statename;
		this.fpsname = fpsname;
		this.allocation_month = allocation_month;
		this.allocation_year = allocation_year;
		this.allocation_type = allocation_type;
		this.comm_code = comm_code;
		this.commodity_name = commodity_name;
		this.allocation_orderno = allocation_orderno;
		this.release_orderno = release_orderno;
		this.stock_recieve_ts = stock_recieve_ts;
		this.truck_chitno = truck_chitno;
		this.reciept_id = reciept_id;
		this.stockrecieved = stockrecieved;
		this.created_on = created_on;
	}
	
	public FpsStockMgt() {
		
	}
}
