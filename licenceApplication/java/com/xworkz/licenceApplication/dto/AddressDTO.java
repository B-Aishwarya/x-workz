package com.xworkz.licenceApplication.dto;

import java.util.Date;

public class AddressDTO {
	private String houseName;
	private String street;
	private String city;
	public String getCity() {
		return city;
	}


	@Override
	public String toString() {
		return "AddressDTO [houseName=" + houseName + ", street=" + street + ", city=" + city + ", pincode=" + pincode
				+ "]";
	}


	public void setCity(String city) {
		this.city = city;
	}


	private int pincode;
	
	
	public AddressDTO() {
		
	}


	public AddressDTO(String houseName, String street, String city, int pincode) {
		super();
		this.houseName = houseName;
	
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	
	

}
