package com.example.dealer.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "onorc_fps_mpin")
public class Mpin {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "mobile_no", nullable = false)
    private String mobileNo;
    
    @Column(name = "mpin", nullable = false)
    private String mpin;
    
    @Column(name = "created_at", nullable = false)
    @CreationTimestamp
    private LocalDateTime created_at;
    
    @Column(name = "updated_at")
    private LocalDateTime updated_at;
    
    @Column(name = "device_id" , nullable = false)
    private String device;
    
    @Column(name = "role" , nullable = false)
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getMpin() {
		return mpin;
	}

	public void setMpin(String mpin) {
		this.mpin = mpin;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}
    
    public Mpin(Long id, String mobileNo, String mpin, LocalDateTime created_at, LocalDateTime updated_at,
			String device, String role) {
		super();
		this.id = id;
		this.mobileNo = mobileNo;
		this.mpin = mpin;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.device = device;
		this.role = role;
	}

	public Mpin() {
    	
    }
}
