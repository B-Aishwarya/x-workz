package com.xworkz.exceptionalTester;
import com.xworkz.exception.dto.ZooDTO;
import com.xworkz.event.ZooExceptionalEvent;

public class ZooTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		String name="Nagarahole";
		 int noOfAnimals=2000;
		 boolean open=true;
		 double entryFees=100;;
		 boolean safari=true;
		
		
		ZooDTO dto=new ZooDTO();
		dto.setName(name);
		dto.setNoOfAnimals(noOfAnimals);
		dto.setOpen(open);
	    dto.setEntryFees(entryFees);
	    dto.setSafari(safari);
	    
	    System.out.println("zoo name is "+dto.getName());
	    System.out.println("no of animals in zoo is "+dto.getNoOfAnimals());
	    System.out.println("zoo is open "+dto.isOpen());
	    System.out.println("entry fees is "+dto.getEntryFees());
	    System.out.println("safari is "+dto.isSafari());
	    
	    ZooDTO dto1=new ZooDTO();
		dto1.setName(name);
		dto1.setNoOfAnimals(noOfAnimals);
		dto1.setOpen(open);
	    dto1.setEntryFees(entryFees);
	    dto1.setSafari(safari);
	    
	    
	    ZooDTO duplicateClone=dto1.clone();
	    System.out.println(duplicateClone.getName());
	    System.out.println(duplicateClone.getNoOfAnimals());
	    System.out.println(duplicateClone.isOpen());
	    
    
	}

}

