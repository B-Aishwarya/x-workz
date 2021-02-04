package com.xworkz.chocolates.services;

import com.xworkz.chocolates.dao.ChocolateDAO;
import com.xworkz.chocolates.dto.ChocolateDTO;


public class ChocolateServiceImpl implements ChocolateService {
	private ChocolateDAO chocolateDAO;

	public ChocolateServiceImpl(ChocolateDAO hocolateDAO) {
		System.out.println("Created CosmeticServiceImpl");
		this.chocolateDAO = chocolateDAO;
		
	}

	@Override
	public boolean validateAndSave(ChocolateDTO chocolateDTO) {
		boolean validDate = false;
		if (chocolateDTO != null) {
		System.out.println("cosmeticDTO is not null");
			String brands = chocolateDTO.getBrand();
			if (brands != null && brands.length() >= 3 && !brands.isEmpty() && !brands.contains(" ")) {
				System.out.println("brand is valid");
				validDate = true;
			} else {
				System.out.println("brand is invalid ");
				validDate = false;
			}
		}
		return validDate;
	}

	@Override
	public void deleteByBrand(String brand) {
		System.out.println("invoked deleteByBrand");
		if (brand != null && !brand.isEmpty() && !brand.contains(" ") && brand.length() >= 3) {
			System.out.println("brand is valid, can delete" + brand);
			this.deleteByBrand(brand);
		} else {
			System.out.println("invalid brand");
		}

	 
		
	}

	@Override
	public int cosmeticsSize() {
		System.out.println("invoked cosmetic size");
		 return this.cosmeticsSize();
	}

}
