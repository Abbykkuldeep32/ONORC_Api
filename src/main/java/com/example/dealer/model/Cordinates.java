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
	
	@Column(name="east_image")
	private String east_image;
	
	@Column(name="west_cord_lat")
	private String west_cord_lat;
	
	@Column(name="west_cord_long")
	private String west_cord_long;
	
	@Column(name="west_image")
	private String west_image;
	
	@Column(name="north_cord_lat")
	private String north_cord_lat;
	
	@Column(name="north_cord_long")
	private String north_cord_long;
	
	@Column(name="north_image")
	private String north_image;
		
	@Column(name="south_cord_lat")
	private String south_cord_lat;
	
	@Column(name="south_cord_long")
	private String south_cord_long;
	
	@Column(name="south_image")
	private String south_image;
	
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

	

	public String getEast_image() {
		return east_image;
	}



	public void setEast_image(String east_image) {
		this.east_image = east_image;
	}



	public String getWest_image() {
		return west_image;
	}



	public void setWest_image(String west_image) {
		this.west_image = west_image;
	}



	public String getNorth_image() {
		return north_image;
	}



	public void setNorth_image(String north_image) {
		this.north_image = north_image;
	}



	public String getSouth_image() {
		return south_image;
	}



	public void setSouth_image(String south_image) {
		this.south_image = south_image;
	}



	public Cordinates(Long id, String east_cord_lat, String east_cord_long, String east_image, String west_cord_lat,
			String west_cord_long, String west_image, String north_cord_lat, String north_cord_long, String north_image,
			String south_cord_lat, String south_cord_long, String south_image, String fpsid) {
		super();
		this.id = id;
		this.east_cord_lat = east_cord_lat;
		this.east_cord_long = east_cord_long;
		this.east_image = east_image;
		this.west_cord_lat = west_cord_lat;
		this.west_cord_long = west_cord_long;
		this.west_image = west_image;
		this.north_cord_lat = north_cord_lat;
		this.north_cord_long = north_cord_long;
		this.north_image = north_image;
		this.south_cord_lat = south_cord_lat;
		this.south_cord_long = south_cord_long;
		this.south_image = south_image;
		this.fpsid = fpsid;
	}



	public Cordinates() {
		
	}

}
