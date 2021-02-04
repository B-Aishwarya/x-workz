package com.xworkz.chocolates.dto;

public class ChocolateDTO {
	private String name;
	private String brand;
	private int quantity;

	public ChocolateDTO(String name, String brand, int quantity) {
		super();
		this.name = name;
		this.brand = brand;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "ChocolateDTO [name=" + name + ", brand=" + brand + ", quantity=" + quantity + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			if (obj instanceof ChocolateDTO) {
				ChocolateDTO casted = (ChocolateDTO) obj;
				if (this.brand != null) {
					if (casted.getBrand().equals(this.brand)) {
						return true;
					}
				}
			}
			System.out.println("ChocolateDTO is not equal ");

		}
		return false;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
