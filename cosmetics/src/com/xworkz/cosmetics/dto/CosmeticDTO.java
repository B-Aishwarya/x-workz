package com.xworkz.cosmetics.dto;
import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;

public class CosmeticDTO {
	private String brand;
	private CosmeticShade shades;
	private CosmeticType type;
	private int price;
	private int quantity;
	
public CosmeticDTO() {
	
}

public CosmeticDTO(String brand, CosmeticShade shades, CosmeticType type, int price, int quantity) {
	super();
	this.brand = brand;
	this.shades = shades;
	this.type = type;
	this.price = price;
	this.quantity = quantity;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public CosmeticShade getShades() {
	return shades;
}

public void setShades(CosmeticShade shades) {
	this.shades = shades;
}

public CosmeticType getType() {
	return type;
}

public void setType(CosmeticType type) {
	this.type = type;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

@Override
public String toString() {
	return "CosmeticDTO [brand=" + brand + ", shades=" + shades + ", type=" + type + ", price=" + price + ", quantity="
			+ quantity + "]";
}
@Override
public boolean equals(Object obj) {
	if(obj==null) {
		if(obj instanceof CosmeticDTO) {
			CosmeticDTO casted=(CosmeticDTO)obj;
			if(this.brand!=null && this.type!=null) {
			if(casted.getBrand().equals(this.brand) && casted.getType().
					equals(this.type)) {
				return true;
			}
		}
	}
		System.out.println("cosmetic DTO is not equal ");
	
}
	return false;


}
}