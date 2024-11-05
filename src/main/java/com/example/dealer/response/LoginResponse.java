package com.example.dealer.response;

import java.util.List;

import com.example.dealer.model.Dealer;

public class LoginResponse {
	private boolean status;
	private String message;
    private List<Dealer> dealer;
    private String token;

    // Getters and Setters
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

	public List<Dealer> getDealer() {
		return dealer;
	}

	public void setDealer(List<Dealer> dealer) {
		this.dealer = dealer;
	}
	

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public LoginResponse(boolean status, String message, List<Dealer> dealer, String token) {
		super();
		this.status = status;
		this.message = message;
		this.dealer = dealer;
		this.token = token;
	}
}
