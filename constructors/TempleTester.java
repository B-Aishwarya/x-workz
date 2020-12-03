package com.xworkz.constructor;

public class TempleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temple temple;
		temple=new Temple("ragavendra swami","Mantralaya","parimala prasadsa",6.00f,8.00f);
		String name=temple.getName();
		String location=temple.getLocation();
		String prasada=temple.getPrasada();	
		System.out.println(name);
		System.out.println(location);
	
		System.out.println(prasada);
	
		prasada="laddu";
        temple.setPrasada(prasada);
	

	}

}
