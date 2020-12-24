package com.xworkz.inheritance.engineer;
import com.xworkz.inheritance.engineer.Engineer;
import com.xworkz.inheritance.engineer.Constants.Branch;

public class MechEngineer extends Engineer {
	private Branch branch = Branch.ECE;
	
	
	public void repairMachine() {
		System.out.println("init repair machine ");
	}

}
