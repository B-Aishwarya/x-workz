package com.xworkz.moonStar.service;
import com.xworkz.moonStar.dto.MenuDTO;
import com.xworkz.moonStar.dto.MenuDTO.Type;

public class FinderImpl implements Finder {

	@Override
	public boolean test(MenuDTO dto) {
		System.out.println("invoked test ");
		if (dto != null && dto.getType().equals(Type.NONVEG)) {
			return true;
		}
		return false;
	}

}
