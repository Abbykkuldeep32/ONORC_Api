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
	
	@Column(name="cord_lat")
	private String cord_lat;
	
	@Column(name="cord_long")
	private String cord_long;
	
	@Column(name="east_image", columnDefinition = "TEXT")
	private String eastImage;
	
	@Column(name="west_image", columnDefinition = "TEXT")
	private String westImage;
	
	@Column(name="north_image", columnDefinition = "TEXT")
	private String northImage;
	
	@Column(name="south_image", columnDefinition = "TEXT")
	private String southImage;
	
	@Column(name="fpsid")
	private String fpsid;
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCord_lat() {
		return cord_lat;
	}



	public void setCord_lat(String cord_lat) {
		this.cord_lat = cord_lat;
	}



	public String getCord_long() {
		return cord_long;
	}



	public void setCord_long(String cord_long) {
		this.cord_long = cord_long;
	}



	public String getEastImage() {
		return eastImage;
	}



	public void setEastImage(String eastImage) {
		this.eastImage = eastImage;
	}



	public String getWestImage() {
		return westImage;
	}



	public void setWestImage(String westImage) {
		this.westImage = westImage;
	}



	public String getNorthImage() {
		return northImage;
	}



	public void setNorthImage(String northImage) {
		this.northImage = northImage;
	}



	public String getSouthImage() {
		return southImage;
	}



	public void setSouthImage(String southImage) {
		this.southImage = southImage;
	}



	public String getFpsid() {
		return fpsid;
	}



	public void setFpsid(String fpsid) {
		this.fpsid = fpsid;
	}


	public Cordinates(Long id, String cord_lat, String cord_long, String eastImage, String westImage, String northImage,
			String southImage, String fpsid) {
		super();
		this.id = id;
		this.cord_lat = cord_lat;
		this.cord_long = cord_long;
		this.eastImage = eastImage;
		this.westImage = westImage;
		this.northImage = northImage;
		this.southImage = southImage;
		this.fpsid = fpsid;
	}


	public Cordinates() {
		
	}

}
