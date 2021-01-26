package com.xworkz.cosmetics.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dto.CosmeticDTO;


public class CosmeticDAOImpl implements CosmeticDAO {
	private List<CosmeticDTO> cosmetics;

	public CosmeticDAOImpl() {
		this.cosmetics = new ArrayList<CosmeticDTO>();
	}

	@Override
	public boolean save(CosmeticDTO dto) {
		boolean added = false;
		boolean contains = this.cosmetics.contains(dto);
		if (!contains) {
			added = this.cosmetics.add(dto);
		}
		if (added)
			System.out.println("cosmetic added " + dto);
		else
			System.out.println("cosmetic not added");
		return false;
	}

	@Override
	public boolean UpdatePriceAndQuantityBYBrand(int price, int quantity, String brand) {
		for (CosmeticDTO cosmeticdto : this.cosmetics) {
			String brandFromDto = cosmeticdto.getBrand();
			if (brandFromDto.equals(brand)) {
				System.out.println("can update , brand is found");
				cosmeticdto.setPrice(price);
				cosmeticdto.setQuantity(quantity);
				System.out.println("updated price and quantity " + cosmeticdto);
				return true;
			} else {
				System.out.println("cannot update , brand not found");
			}
		}
		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(int price, String brand, CosmeticType type) {
		for (CosmeticDTO cosmeticdto : this.cosmetics) {
			String brandfrmdto = cosmeticdto.getBrand();
			CosmeticType cosmeticType = cosmeticdto.getType();
			if (brandfrmdto.equals(brand) && cosmeticType.equals(type)) {
				System.out.println("can update the price , brand and type is found");
				cosmeticdto.setPrice(price);
				System.out.println("updated price " + cosmeticdto);
				return true;
			} else {
				System.out.println("cannot update ,brand and type is not found ");
			}
		}
		return false;
	}

	@Override
	public boolean updateTypeBYBrand(String brand, CosmeticType type) {
		for (CosmeticDTO cosmetics : this.cosmetics) {
			String brands = cosmetics.getBrand();
			if (brands.equals(brand)) {
				System.out.println("can update the type  , brand is found");
				cosmetics.setType(type);
				System.out.println("updated type " + cosmetics);
				return true;
			} else {
				System.out.println("cannot update ,brand  is not found ");
			}
		}
		return false;
	}

	@Override
	public boolean deletByBrand(String brand) {
		Iterator<CosmeticDTO> iterator = cosmetics.iterator();
		while (iterator.hasNext()) {
			CosmeticDTO next = iterator.next();
			String getBrand = next.getBrand();
			if (getBrand.equals(brand)) {
				System.out.println("brand is found so delete");
				iterator.remove();
				return true;
			} else {
				System.out.println("brand is not found");
			}
		}
		return false;
	}

	@Override
	public void deleteAll() {
		Iterator<CosmeticDTO> iterator = cosmetics.iterator();
		while (iterator.hasNext()) {
			CosmeticDTO next = iterator.next();
			iterator.remove();
		}

	}

	@Override
	public List<CosmeticDTO> getAll() {
		System.out.println("invoked get all");
		for (CosmeticDTO cosmeticDTO : cosmetics) {
			System.out.println("entered");
			System.out.println(cosmeticDTO);
			return cosmetics;
			
		}
		return null;
	}

	@Override
	public int totalSize() {
       System.out.println("invoked total size");
       int size=cosmetics.size();
       System.out.println(size);
		return size;
	}

}
