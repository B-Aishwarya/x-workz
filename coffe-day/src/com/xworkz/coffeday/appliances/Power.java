package com.xworkz.coffeday.appliances;

public class Power {
	 private int voltage=0;
	  private boolean availability;
	  
	  
	  public Power() {
		  System.out.println("created power");
	  }
	  
	  public boolean generatePower()
	  {
		  this.availability=true;
		  this.voltage=256;
		  return true;
	  }

}
