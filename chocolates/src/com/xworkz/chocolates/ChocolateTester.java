package com.xworkz.chocolates;

import com.xworkz.chocolates.dao.ChocolateDAO;
import com.xworkz.chocolates.dao.ChocolateDAOImpl;
import com.xworkz.chocolates.dto.ChocolateDTO;

public class ChocolateTester {

	public static void main(String[] args) {
		ChocolateDTO dto = new ChocolateDTO("Dairy Milk", "Cadberry", 2);
		ChocolateDAO dao = new ChocolateDAOImpl();
		dao.save(dto);
		ChocolateDTO dtoFound = dao.findByName("Cadberry");
		System.out.println(dtoFound);

		boolean updated = dao.UpdateNameBYBrand("milkybar", "Cadberry");
		System.out.println("updated " + updated);

		ChocolateDTO deleted = dao.findByName("milkybar");
		System.out.println("deleted" + deleted);
		dao.deletByBrand("milkybar");

	}

}
