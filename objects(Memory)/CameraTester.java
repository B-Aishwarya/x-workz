package com.xworkz.memory.camera;

public class CameraTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera camera=new Camera();
		System.out.println("camera type is " + Camera.type);
		Camera.type="SLR";
		System.out.println("camera new type is " + Camera.type);
		System.out.println("camera brand is " +  camera.brand);
		camera.brand="kodak";
	     System.out.println("camera new brand is " +  camera.brand);
	 	System.out.println("camera price is " + camera.price);
	 	System.out.println("camera rent per day is " + camera.rentPerDay);
	 	System.out.println("camera fulform is " + Camera.fulForm);
	 	System.out.println("camera owner is " + Camera.owner);
	 	Camera.owner="anusha";
	 	System.out.println("camera new owner is " + Camera.owner);
	 	System.out.println("camera founder is " + Camera.founder);
	 	
	 	
		

	}

}
