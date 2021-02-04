package com.xworkz.chocolates.dao;

import com.xworkz.chocolates.dto.ChocolateDTO;

public interface ChocolateDAO {
	
	public void save(ChocolateDTO dto);
	public ChocolateDTO findByName(String name);
	boolean UpdateNameBYBrand( String name, String brand);

	boolean deletByBrand(String brand);

	boolean validateAndSave(ChocolateDTO chocolateDTO);

}
