package com.xworkz.typeCasting.footwear;
import com.xworkz.typeCasting.footwear.Footwear;

public class ShoeFootware extends Footwear {
	public double calculateDiscount() {
		double price = super.getPrice();
		double discount = 0;
		if (price >= 1000) {
			discount = 100;
		}
		if (price >= 2000) {
			discount = 200;
		}
		return discount;
	}

}
