package com.example.dealer.response;

import java.util.List;

import com.example.dealer.model.Dealer;

public class LoginResponse {
	private boolean status;
	private String message;
    private List<Dealer> data;
    private String token;
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
	public List<Dealer> getData() {
		return data;
	}
	public void setData(List<Dealer> data) {
		this.data = data;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public LoginResponse(boolean status, String message, List<Dealer> data, String token) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
		this.token = token;
	}

    // Getters and Setters
    
}
