package com.xworkz.typeCasting.sports;

import com.xworkz.typeCasting.sports.awards.Ceremony;

public class CeremonyTester {

	public static void main(String[] args) {
		Ceremony ceremony=new Ceremony("Agadi Habba");
		String[] foodItems= {"panipuri" ,"samosa","mashroom fry",
				"paneer manchury","rasmalai"};
		ceremony.setFoods(foodItems);
		ceremony.distributeAwards("vena", "oscar");
		ceremony.displayCeremonyNameAndFood();
		ceremony.accessParentMembers();
		int code=ceremony.hashCode();
		System.out.println(code);
		}
		

	}


