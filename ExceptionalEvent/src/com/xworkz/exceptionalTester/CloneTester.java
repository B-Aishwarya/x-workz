package com.xworkz.exceptionalTester;
import com.xworkz.event.ExceptionEvent;
import com.xworkz.event.ZooExceptionalEvent;
import com.xworkz.exception.dto.PalaceDTO;

public class CloneTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		PalaceDTO palaceDTO = new PalaceDTO();
		String location = "Agra";
		String kingName = "Shah Jahan";
		String queenName = "Mumtaz Mahal";

		palaceDTO.setKingName(kingName);
		palaceDTO.setQueenName(queenName);
		palaceDTO.setLocation(location);

		System.out.println("King name is " + palaceDTO.getKingName());
		System.out.println("Queen name is " + palaceDTO.getQueenName());
		System.out.println("Tajmahal is located in " + palaceDTO.getLocation());

		PalaceDTO duplicate = new PalaceDTO();
		duplicate.setKingName(kingName);
		duplicate.setQueenName(queenName);
		duplicate.setLocation(location);

		PalaceDTO duplicateClone = duplicate.clone();
		System.out.println("duplicated clone is  " + duplicateClone.getKingName());
		System.out.println("duplicated clone is  " + duplicateClone.getQueenName());
		System.out.println("duplicated clone is " + duplicateClone.getLocation());

	}

	 
	


}
