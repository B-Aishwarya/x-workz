package com.xworkz.identity.bakery;

public class TasteTester extends Cake{
	
	public static void main(String[] args) {
	Cake cake=new Cake();
	cake.setFlavour("cake flavour is Red velvet");
	cake.setSize(1.0);
	cake.setShape("cake shape is round");
	System.out.println(cake.getFlavour());
	System.out.println(cake.getShape());
	System.out.println(cake.getSize());
	
	
    HoneyCake honey=new HoneyCake();
    honey.setHoney(true);
    System.out.println(honey.isHoney());
}
}