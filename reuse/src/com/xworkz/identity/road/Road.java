package com.xworkz.identity.road;

public class Road {
	
	private double width;
	private String typeOfRoad;
   
	public boolean humps() {
		boolean roadHumps=true;
		return roadHumps;
	}
	
	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public String getTypeOfRoad() {
		return typeOfRoad;
	}


	public void setTypeOfRoad(String typeOfRoad) {
		this.typeOfRoad = typeOfRoad;
	}
	}