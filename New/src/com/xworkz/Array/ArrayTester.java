package com.xworkz.Array;

import java.util.Arrays;

public class ArrayTester {

	public static void main(String[] args) {
		String[] stateName= {"KARNATAKA","GOA","TELANGANA","ANDRAPRADESH","MAHARASTRA","CHENNAI","BIHAR"};
		int sizeOfArray=stateName.length;
		System.out.println("total length of array" + sizeOfArray);
		System.out.println("*******************");
		
		
		String stateNameAtZero=stateName[0];
		System.out.println("Name of state at index position 0 is" +  stateNameAtZero);
		 stateName[5]="TAMILNADU";
		 System.out.println("state name is changed from chennai to"+ stateName[5]);
		 System.out.println(Arrays.toString(stateName));
		 System.out.println("*******************");
		 
		 
		 
		 
		 String[] countryName=new String[10];
		 System.out.println(countryName[1]="INDIA");
		 System.out.println(countryName[2]="PAKISTAN");
		 System.out.println(countryName[3]="RUSSIA");
		 System.out.println(countryName[4]="AUSTRELIA");
		 countryName[3]="CHINA";
			
			
		
	}

}
