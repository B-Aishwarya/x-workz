package com.xworkz.data.DTO;

public class CustomerDTO {
	private int  customerId;
	private  String name;
	private long phonenumber;
	private String email;
	
	
	
	public CustomerDTO()
	{
		
	}

	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getPhonenumber() {
		return phonenumber;
	}



	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
	

	
	
	