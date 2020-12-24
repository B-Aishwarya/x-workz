package com.xworkz.inheritance;
import com.xworkz.inheritance.engineer.CsEngineer;
import com.xworkz.inheritance.engineer.Engineer;
import com.xworkz.inheritance.engineer.IsEngineer;
import com.xworkz.inheritance.engineer.Constants.Branch;


public class VtuTester {
	public static void main(String[] args) {
		Engineer eng = new CsEngineer();
		CsEngineer childRef = (CsEngineer) eng;
		childRef.setName("aishwarya");
		childRef.setBranch(Branch.CSE);
		System.out.println(childRef.getName());
		System.out.println(childRef.getBranch());
		childRef.problemSolving();
		childRef.bunking();	
		Engineer generic = new CsEngineer();
		CsEngineer csEngineer = new CsEngineer();
		IsEngineer ise=new IsEngineer();
		if (generic instanceof CsEngineer) {
			System.out.println("yes it is of CsEngineer");
			CsEngineer casted = (CsEngineer) generic;
			casted.setUsn("2ka15cs006");
			System.out.println(casted.getUsn());
			//casted.problemSolving();
		} else {
			System.out.println("Engineer is is not instance of CsEngineer");
		}
		 Engineer engineer1=new IsEngineer();
	        engineer1.problemSolving();
	        System.out.println(engineer1.getBranch());
	        
		
	}

}
