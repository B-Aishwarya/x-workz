package com.xworkz.identity.road;

public class RoadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Road road=new Road();
		road.setTypeOfRoad("Tar road");
		road.setWidth( +3.25);
		System.out.println("road type is" + road.getTypeOfRoad());
		System.out.println("road length is" +road.getWidth());
		road.setTypeOfRoad("National highways");
		road.setWidth(6.00);
		System.out.println("road type is" +road.getTypeOfRoad());
		System.out.println("road length is" +road.getWidth());
		
     
		NiceRoad nice=new NiceRoad();
		nice.setTraffic(true);
		System.out.println("traffic is heavy" +  nice.isTraffic());
	
		
		
		
		
	}

}
