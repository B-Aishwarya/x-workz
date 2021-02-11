package com.xworkz.freedomFighters;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTester {

	public static void main(String[] args) {
	new String();
	
	Set<String> hashSets=new HashSet<String>();//sorted list
	 hashSets.add("Paris");
	 hashSets.add("Bangcock");
	 hashSets.add("Dubai");
	 hashSets.add("Austrelia");
	 hashSets.add(null);
	System.out.println( hashSets.size());
	hashSets.forEach(e-> System.out.println(e));
	 System.out.println("********************************");
	 
	 hashSets=new LinkedHashSet<String>();
	 hashSets.add("Bangalore");
	 hashSets.add("Udupi");
	 hashSets.add("Goa");
	 hashSets.add("Mysore");
	 hashSets.add("coorg");
	 hashSets.add("Chikmaglur");
	 hashSets.add(null);
	 
	 System.out.println(hashSets.size());
	 hashSets.forEach(e-> System.out.println(e));
	 
	 
	 
	}
  
	}


