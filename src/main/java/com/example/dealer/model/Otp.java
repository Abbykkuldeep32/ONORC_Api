package com.example.dealer.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fps_otp")
public class Otp {
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(name = "mobile_no", nullable = false)
	    private String mobileNo;
	    
	    @Column(name = "otp", nullable = false)
	    private String otp;
	    
	    @Column(name = "created_at", nullable = false)
	    private LocalDateTime createdAt;

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

		public String getOtp() {
			return otp;
		}

		public void setOtp(String otp) {
			this.otp = otp;
		}

		public LocalDateTime getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}

		public Otp(Long id, String mobileNo, String otp, LocalDateTime createdAt) {
			super();
			this.id = id;
			this.mobileNo = mobileNo;
			this.otp = otp;
			this.createdAt = createdAt;
		}

	    public Otp() {
	    	
	    }
}
