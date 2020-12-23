package com.xworkz.typeCasting.footwear;

import com.xworkz.typeCasting.footwear.constants.FootwearType;

public class Footwear {
	private int size;
	private String brand;
	private double price;
	private FootwearType footwareType;

	public void protect() {
		System.out.println("init protect");
	}

	public void displayDetails() {
		System.out.println("invoked displayDetails ");
		System.out.println(this.size);
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.footwareType);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public FootwearType getFootwareType() {
		return footwareType;
	}

	public void setFootwareType(FootwearType footwareType) {
		this.footwareType = footwareType;
	}

}
