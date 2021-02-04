package com.xworkz.chocolates.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.chocolates.dto.ChocolateDTO;

public class ChocolateDAOImpl implements ChocolateDAO {

	private List<ChocolateDTO> database;

	public ChocolateDAOImpl() {
		this.database = new ArrayList<ChocolateDTO>();
	}

	@Override
	public void save(ChocolateDTO dto) {
		System.out.println("invoked save in Chocolate dao impl");
		System.out.println("dto to save" + dto);
		boolean saved = this.database.add(dto);
		if (saved)
			System.out.println("dto is saved");
		else
			System.out.println("dto is not saved");
	}

	@Override
	public ChocolateDTO findByName(String name) {
		System.out.println("invoked findByName");
		System.out.println("name:" + name);
		for (ChocolateDTO chocolateDTO : this.database) {
			String nameFromDTO = chocolateDTO.getName();
			if (nameFromDTO.equals(name)) {
				System.out.println("name found");
				return chocolateDTO;
			}
		}
		return null;
	}

	@Override
	public boolean UpdateNameBYBrand(String name, String brand) {
		ChocolateDTO dtoFromDB = this.findByName(name);
		if (dtoFromDB != null) {
			System.out.println("can update , brand is found");
			dtoFromDB.setName("munch");
			return true;
		} else {
			System.out.println("cannot update , brand not found");
		}
		return false;
	}

	@Override
	public boolean deletByBrand(String brand) {
		ChocolateDTO dto = this.findByName(brand);
		if (dto != null) {
			this.database.remove(dto);
		}
		return false;
	}

	@Override
	public boolean validateAndSave(ChocolateDTO chocolateDTO) {
		System.out.println("invoked validate and save");
		return false;
	}

}
