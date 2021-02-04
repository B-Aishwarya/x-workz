package com.xworkz.chocolates.services;

import com.xworkz.chocolates.dto.ChocolateDTO;

public interface ChocolateService {
	public boolean validateAndSave(ChocolateDTO chocolateDTO);
    void deleteByBrand(String brand);
	int cosmeticsSize();


}
