package com.example.dealer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="fps_new_cordinates")
public class Cordinates {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="east_cord")
	private String east_cord;
	
	@Column(name="west_cord")
	private String west_cord;
	
	@Column(name="north_cord")
	private String north_cord;
		
	@Column(name="south_cord")
	private String south_cord;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEast_cord() {
		return east_cord;
	}

	public void setEast_cord(String east_cord) {
		this.east_cord = east_cord;
	}

	public String getWest_cord() {
		return west_cord;
	}

	public void setWest_cord(String west_cord) {
		this.west_cord = west_cord;
	}

	public String getNorth_cord() {
		return north_cord;
	}

	public void setNorth_cord(String north_cord) {
		this.north_cord = north_cord;
	}

	public String getSouth_cord() {
		return south_cord;
	}

	public void setSouth_cord(String south_cord) {
		this.south_cord = south_cord;
	}
	
	

}
