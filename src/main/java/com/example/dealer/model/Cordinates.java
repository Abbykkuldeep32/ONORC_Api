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
	
	@Column(name="east_cord_lat")
	private String east_cord_lat;
	
	@Column(name="east_cord_long")
	private String east_cord_long;
	
	@Column(name="west_cord_lat")
	private String west_cord_lat;
	
	@Column(name="west_cord_long")
	private String west_cord_long;
	
	@Column(name="north_cord_lat")
	private String north_cord_lat;
	
	@Column(name="north_cord_long")
	private String north_cord_long;
		
	@Column(name="south_cord_lat")
	private String south_cord_lat;
	
	@Column(name="south_cord_long")
	private String south_cord_long;
	
	@Column(name="fpsid")
	private String fpsid;
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getEast_cord_lat() {
		return east_cord_lat;
	}



	public void setEast_cord_lat(String east_cord_lat) {
		this.east_cord_lat = east_cord_lat;
	}



	public String getEast_cord_long() {
		return east_cord_long;
	}



	public void setEast_cord_long(String east_cord_long) {
		this.east_cord_long = east_cord_long;
	}



	public String getWest_cord_lat() {
		return west_cord_lat;
	}



	public void setWest_cord_lat(String west_cord_lat) {
		this.west_cord_lat = west_cord_lat;
	}



	public String getWest_cord_long() {
		return west_cord_long;
	}



	public void setWest_cord_long(String west_cord_long) {
		this.west_cord_long = west_cord_long;
	}



	public String getNorth_cord_lat() {
		return north_cord_lat;
	}



	public void setNorth_cord_lat(String north_cord_lat) {
		this.north_cord_lat = north_cord_lat;
	}



	public String getNorth_cord_long() {
		return north_cord_long;
	}



	public void setNorth_cord_long(String north_cord_long) {
		this.north_cord_long = north_cord_long;
	}



	public String getSouth_cord_lat() {
		return south_cord_lat;
	}



	public void setSouth_cord_lat(String south_cord_lat) {
		this.south_cord_lat = south_cord_lat;
	}



	public String getSouth_cord_long() {
		return south_cord_long;
	}



	public void setSouth_cord_long(String south_cord_long) {
		this.south_cord_long = south_cord_long;
	}


	public String getFpsid() {
		return fpsid;
	}



	public void setFpsid(String fpsid) {
		this.fpsid = fpsid;
	}

	

	public Cordinates(Long id, String east_cord_lat, String east_cord_long, String west_cord_lat, String west_cord_long,
			String north_cord_lat, String north_cord_long, String south_cord_lat, String south_cord_long,
			String fpsid) {
		super();
		this.id = id;
		this.east_cord_lat = east_cord_lat;
		this.east_cord_long = east_cord_long;
		this.west_cord_lat = west_cord_lat;
		this.west_cord_long = west_cord_long;
		this.north_cord_lat = north_cord_lat;
		this.north_cord_long = north_cord_long;
		this.south_cord_lat = south_cord_lat;
		this.south_cord_long = south_cord_long;
		this.fpsid = fpsid;
	}



	public Cordinates() {
		
	}

}
