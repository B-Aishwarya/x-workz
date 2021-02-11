package com.xworkz.moonStar;

import com.xworkz.moonStar.dto.MenuDTO;
import com.xworkz.moonStar.service.Finder;
import com.xworkz.moonStar.service.RestaurantService;
import com.xworkz.moonStar.service.RestaurantServiceImpl;

public class MenuTester {

	public static void main(String[] args) {
		RestaurantService restaurantService = new RestaurantServiceImpl();
		restaurantService.findAndDisplay(new Finder() {
			@Override
			boolean test(MenuDTO dto); {
				if (dto.getPrice() < 200) {
					return true;
				}
				return false;
			}

		});
restaurantService.findAndDisplay(d->d.getPrice()>300);
		
		Collections.sort(list);
	}

	}


