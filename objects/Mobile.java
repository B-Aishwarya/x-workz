package com.xworkz.concepts.obj;

public class Mobile {
	public String model;
	public String color;
	public String price;
	public String battery;
	public static String yom;
	
	public void displayInfo()
	{
		System.out.println("invoked displayInfo");
		System.out.println(model);
		System.out.println(color);
		System.out.println(price);
		System.out.println(battery);
		System.out.println(yom);	

}
}
