package com.xworkz.chocolates;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.chocolates.dao.ChocolateDAOImpl;
import com.xworkz.chocolates.dto.ChocolateDTO;
import com.xworkz.chocolates.services.ChocolateService;
import com.xworkz.chocolates.services.ChocolateServiceImpl;

public class ValidationTester {

	public static void main(String[] args) {
		ChocolateDTO dto1 = new ChocolateDTO("kitkat", "nestle", 10);
		 System.out.println(dto1);
		 ChocolateDTO dto2 = new ChocolateDTO("dairymilk", "cadberry", 15);
		 System.out.println(dto2);
		 
		List<ChocolateDTO> list = new LinkedList<ChocolateDTO>();

		ChocolateDAOImpl dao = new ChocolateDAOImpl();

		ChocolateService service = new ChocolateServiceImpl(dao);

		service.validateAndSave(dto1);

	}

}
