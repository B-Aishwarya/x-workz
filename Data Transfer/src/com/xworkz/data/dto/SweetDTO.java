package com.xworkz.data.dto;
import com.xworkz.data.constants.Shape;
import com.xworkz.data.constants.Color;

public class SweetDTO {
	private String name;
	private int price;
	private String popularState;
	private Shape shape;
	private Color[] color;
	
	
	public SweetDTO(String name, int price, String popularState, Shape shape, Color[] color) {
		super();
		this.name = name;
		this.price = price;
		this.popularState = popularState;
		this.shape = shape;
		this.color = color;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getPopularState() {
		return popularState;
	}


	public void setPopularState(String popularState) {
		this.popularState = popularState;
	}


	public Shape getShape() {
		return shape;
	}


	public void setShape(Shape shape) {
		this.shape = shape;
	}


	public Color[] getColor() {
		return color;
	}


	public void setColor(Color[] color) {
		this.color = color;
	}
	
	
	
	
	
}
