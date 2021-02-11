package com.xworkz.freedomFighters;

import com.xworkz.functional.service.DisplayService;
import com.xworkz.functional.service.ServiceDisplayImpl;

public class DisplayTester {

	public static void main(String[] args) {
		DisplayService services=new  ServiceDisplayImpl();
		services.printString((l,t)->{
			System.out.println("validating"+l );
			if(l.contains("a") || l.contains("A"))
			{
				System.out.println(l+ " "+l.hashCode());
			}
		});
		

	}

}
