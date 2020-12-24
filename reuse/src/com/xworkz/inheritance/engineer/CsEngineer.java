package com.xworkz.inheritance.engineer;

import com.xworkz.inheritance.engineer.Constants.Branch;
import com.xworkz.inheritance.engineer.Engineer;

public class CsEngineer extends Engineer {
	private Branch branch = Branch.CSE;

	public void problemSolving() {
		super.problemSolving();
		System.out.println("init problem solving");
		System.out.println("problem solved by " + this.branch);
         
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		branch = branch;
	}

}
