package com.xworkz.inheritance.engineer;

import com.xworkz.inheritance.engineer.Constants.Branch;

public class Engineer {
	private String name;
	private String usn;
	private Branch branch = Branch.MECH;

	public void problemSolving() {
		System.out.println("invoked problemSolving");
		System.out.println("problem solved by " + this.branch);
	}

	public final void bunking() {
		System.out.println("engineer bunked");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		branch = branch;
	}

}
