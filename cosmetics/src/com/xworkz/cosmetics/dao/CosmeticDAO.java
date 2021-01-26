package com.xworkz.cosmetics.dao;

import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public interface CosmeticDAO {
	public boolean save(CosmeticDTO dto);

	boolean UpdatePriceAndQuantityBYBrand(int price, int quantity, String brand);

	boolean updatePriceByBrandAndType(int price, String brand,  CosmeticType type);

	boolean updateTypeBYBrand(String brand, CosmeticType type);

	boolean deletByBrand(String brand);

	void deleteAll();

	List<CosmeticDTO> getAll();

	int totalSize();

}
