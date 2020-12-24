package com.xworkz.inheritance.engineer;
import com.xworkz.inheritance.engineer.Constants.Branch;
import com.xworkz.inheritance.engineer.Engineer;


public class IsEngineer extends Engineer{
	private Branch branch = Branch.ISE;
	
	public void writingCode() {
		System.out.println("init writingCode");
	}

}
