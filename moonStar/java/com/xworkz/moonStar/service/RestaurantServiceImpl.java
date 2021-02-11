package com.xworkz.moonStar.service;

import java.util.List;
import java.util.LinkedList;
import com.xworkz.moonStar.dto.MenuDTO;
import com.xworkz.moonStar.dto.MenuDTO.Type;

public class RestaurantServiceImpl implements RestaurantService {
	private List<MenuDTO> menuDTO;
	
	public RestaurantServiceImpl() {
		this.menuDTO = new LinkedList<MenuDTO>();
		MenuDTO menu1=new MenuDTO("KFC", 300, Type.NONVEG);
		MenuDTO menu2=new MenuDTO("rasmalai", 450, Type.VEG);
		MenuDTO menu3=new MenuDTO("bisibelebath", 40, Type.VEG);
		MenuDTO menu4=new MenuDTO("pastry", 50, Type.NONVEG);
		MenuDTO menu5=new MenuDTO("Hologe", 15, Type.VEG);
		
		this.menuDTO.add(menu1);
		this.menuDTO.add(menu2);
		this.menuDTO.add(menu3);
		this.menuDTO.add(menu4);
		this.menuDTO.add(menu5);

		
	}

	@Override
	public void displayItemGreaterThan(double price) {
		for (MenuDTO menuDTO2 : menuDTO) {
			if(menuDTO2.getPrice()>=price) {
				System.out.println(menuDTO2);
			}
			
		}
		

	}

	@Override
	public void displayByName(String name) {
		for (MenuDTO menuDTO2 : menuDTO) {
			if (menuDTO2.getName().equals(name)) {
				System.out.println(menuDTO);
			}
		}
	}

	@Override
	public void findAndDisplay(Finder finder) {
		for (MenuDTO menuDTO2 : menuDTO) {
			if(finder.test(menuDTO2));
			System.out.println(menuDTO2);
			
		}

	}

}
