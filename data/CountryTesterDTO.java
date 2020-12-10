package com.xworkz.data;
import com.xworkz.data.DTO.CountryDTO;


public class CountryTesterDTO {

	public static void main(String[] args) {
		String[] languages= {"kannada","English","Hindi"};
		String[] states= {"karnataka","goa","telangana"}; 
		
				
		CountryDTO country=new CountryDTO("Pranab Mukarjee", languages);
		System.out.println(country.getPresident());
		System.out.println(country.getLanguages());
		country.setPresident("Ramnath Kovindh");
		country.setLanguages(languages);
		System.out.println(country.getPresident());
		System.out.println(country.getLanguages());
		
		
		
		CountryDTO country1=new CountryDTO(12345566433222222l, "Manmohan singh");
		System.out.println(country1.getPrimeMinister());
		System.out.println(country1.getPopulation());
		country1.setPrimeMinister("Narendra Modi");
		System.out.println(country1.getPrimeMinister());
		country1.setPopulation(3422677777788l);
		System.out.println(country1.getPopulation());
		
		
	
		
		
		CountryDTO country2=new CountryDTO("India", "Asia",states );
		System.out.println(country2.getName());
		System.out.println(country2.getContinent());
		System.out.println(country2.getStates());
		country2.setName("sri lanka");
		country2.setContinent("asia");
		System.out.println(country2.getName());
		System.out.println(country2.getContinent());
		
		
	
		
		
		
		
		
	
	}

}
