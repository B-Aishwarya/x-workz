package com.xworkz.coffeday.appliances;
import com.xworkz.coffeday.appliances.Power;

public class CoffeeMachine {
	private Power power;
	
 
   
	public CoffeeMachine(Power power) {
		super();
		this.power = power;
	}



	public boolean grind(String bean) {
		System.out.println("invoked grind");
		if (bean != null) {
			boolean generated = this.power.generatePower();
			if (generated) {
				System.out.println("grinding"+ bean);
				return true;
			} else {
				System.out.println("not griding");
				return false;
			}
		} else {
			System.out.println("bean is not there");
			return false;
		}
	}

}