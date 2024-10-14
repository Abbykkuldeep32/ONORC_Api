package com.example.dealer.response;

import com.example.dealer.model.Grievance;

public class SaveResponse {
	private String message;
    private Grievance grievance;

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Grievance getGrievance() {
        return grievance;
    }

    public void setGrievance(Grievance grievance) {
        this.grievance = grievance;
    }

	public SaveResponse(String message, Grievance grievance) {
		super();
		this.message = message;
		this.grievance = grievance;
	}
    
    
}
