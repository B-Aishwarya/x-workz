package com.xworkz.typeCasting;
import com.xworkz.typeCasting.footwear.Footwear;
import com.xworkz.typeCasting.footwear.ShoeFootware;
import com.xworkz.typeCasting.footwear.constants.FootwearType;

public class FWTester {
	public static void main(String[] args) {

		ShoeFootware shoefootware = new ShoeFootware();

		shoefootware.setBrand("sparx");
		shoefootware.setPrice(3000);
		shoefootware.setFootwareType(FootwearType.SPORTS);
		shoefootware.setSize(8);
		shoefootware.displayDetails();

		double dis = shoefootware.calculateDiscount();
		System.out.println(dis);

	}
}