package com.example.dealer.response;

import java.util.List;

import com.example.dealer.model.Dealer;

public class LoginResponse {
	private boolean status;
	private String message;
    private List<?> data;
    private String token;
    private String role;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<?> getData() {
		return data;
	}
	public void setData(List<?> data) {
		this.data = data;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public LoginResponse(boolean status, String message, List<?> data, String token,String role) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
		this.token = token;
		this.role = role;
	}

    // Getters and Setters
    
}
