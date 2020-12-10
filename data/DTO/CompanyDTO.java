package com.xworkz.data.DTO;

public class CompanyDTO {
	private String name;
	private String type;
	private long turnOver;
	private String employeeId;
	private String website;
	
	
	public CompanyDTO(String name,String type) {
		this.name=name;
		this.type=type;
	}
	
    public CompanyDTO(long turnOver,String employeeId) {
    	this.turnOver=turnOver;
    	this.employeeId=employeeId;
    	
}
    public CompanyDTO(String website) {
    	this.website=website;
    
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(long turnOver) {
		this.turnOver = turnOver;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}  
    
}