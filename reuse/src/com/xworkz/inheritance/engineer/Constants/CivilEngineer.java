package com.xworkz.inheritance.engineer.Constants;
import com.xworkz.inheritance.engineer.Engineer;

public class CivilEngineer extends Engineer {
	private Branch branch = Branch.CIVIL;
	
	
	public void doSurvey() {
		System.out.println("init do survey");
	}

}
