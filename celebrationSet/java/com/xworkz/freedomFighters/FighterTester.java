package com.xworkz.freedomFighters;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.freedomFighters.dto.FreedomFighterDTO;
import com.xworkz.freedomFighters.dto.FreedomFighterDTO.Gender;

public class FighterTester {

	public static void main(String[] args) {
		FreedomFighterDTO dto=new FreedomFighterDTO("Bhagath Singh", "punjab", Gender.MALE);
		FreedomFighterDTO dto1=new FreedomFighterDTO("Subhash Chandra bose", "Bengal", Gender.MALE);
		FreedomFighterDTO dto2=new FreedomFighterDTO("Rani channamma", "Karnataka", Gender.FEMALE);
		FreedomFighterDTO dto3=new FreedomFighterDTO("Bhagath Singh", "punjab", Gender.MALE);
		FreedomFighterDTO dto4=new FreedomFighterDTO("Sardar Vallabhbhai Patel", "bihar", Gender.MALE);
		
		Set<FreedomFighterDTO> freedom=new HashSet<FreedomFighterDTO>();
		freedom.add(dto);
		freedom.add(dto1);
		freedom.add(dto2);
		freedom.add(dto3);
		freedom.add(dto4);
		System.out.println(freedom.size());
	
		freedom.forEach(f->System.out.println(f.getName()));
		}

}
