package com.xworkz.inheritance.engineer;
import com.xworkz.inheritance.engineer.Engineer;
import com.xworkz.inheritance.engineer.Constants.Branch;

public class EEEngineer extends Engineer{
	private Branch branch = Branch.EEE;
	
	
	public void supplyPower() {
		System.out.println("init supply power");
	}

}
