package com.xworkz.cosmetics;

import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dao.CosmeticDAOImpl;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {
		CosmeticDTO cosmeticDTO = new CosmeticDTO("nyka", CosmeticShade.PINK, CosmeticType.BLUSH, 100, 1);
		CosmeticDAO dao = new CosmeticDAOImpl();
		
		dao.save(cosmeticDTO);
		System.out.println("*******************************");
		
		dao.UpdatePriceAndQuantityBYBrand(500, 2, "nyka");
		System.out.println("*******************************");
		
		dao.updatePriceByBrandAndType(1000, "nyka", CosmeticType.BLUSH);
		System.out.println("*******************************");
		
		dao.updateTypeBYBrand("nyka", CosmeticType.EYELINER);
		System.out.println("*******************************");
		
		
		dao.getAll();
		dao.totalSize();
		dao.deletByBrand("nyka");
		dao.deleteAll();
		
		

	}
}