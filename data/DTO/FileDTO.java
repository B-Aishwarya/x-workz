package com.xworkz.data.DTO;

import java.util.Date;

public class FileDTO {
	private String name;
	private String type;
	private double size;
	private Date createdDate;
	
	
	public FileDTO(String name,double size) {
		this.name=name;
		this.size=size;
		
	}
	public FileDTO(String type) {
		this.type=type;
		
	
	}
	public FileDTO(Date createdDate) {
		this.createdDate=createdDate;
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
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
	

}
