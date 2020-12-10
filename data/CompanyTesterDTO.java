package com.xworkz.data;
import com.xworkz.data.DTO.CompanyDTO;

public class CompanyTesterDTO {

	public static void main(String[] args) {
		CompanyDTO company=new CompanyDTO("TCS", "IT");
		System.out.println(company.getName());
		System.out.println(company.getType());
		company.setName("Infosys");
		System.out.println(company.getName());
		company.setType("MNC");
		System.out.println(company.getType());
		
		CompanyDTO company1=new CompanyDTO(161541l, "tcs121");
		System.out.println(company1.getTurnOver());
		System.out.println(company1.getEmployeeId());
		company.setTurnOver(65454553l);
		System.out.println(company.getTurnOver());
		company.setEmployeeId("info212");
		System.out.println(company.getEmployeeId());
		
		
		CompanyDTO company2=new CompanyDTO("www.tcs.com");
		System.out.println(company2.getWebsite());
		company2.setWebsite("www.infosys.com");
		System.out.println(company2.getWebsite());
		
		


	}

}
