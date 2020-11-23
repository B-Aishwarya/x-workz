package com.xworkz.concepts.obj;

public class MobileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Mobile.yom="2020";
		
		Mobile mobile=new Mobile();
		//vehicle.displayInfo();
		mobile.color="Black";
		mobile.price="80000";
		mobile.model="Iphone";
		mobile.battery="5mAh";
		mobile.displayInfo();
		System.out.println("******************************");
		
		
		Mobile mobile2=new Mobile();
		mobile2.color="pink";
		mobile.price="25000";;
		mobile2.model="Redmi";
		mobile.battery="7mAh";
		mobile2.displayInfo();
		System.out.println("******************************");
		
		
		Mobile mobile3=new Mobile();
		mobile2.color="dark blue";
		mobile.price="16000";;
		mobile2.model="Samsung Galaxy";
		mobile.battery="6mAh";
		mobile2.displayInfo();
		System.out.println("******************************");

		Mobile mobile4=new Mobile();
		mobile2.color="maroon";
		mobile.price="20000";;
		mobile2.model="Vivo v9";
		mobile.battery="4mAh";
		mobile2.displayInfo();


	}

}
