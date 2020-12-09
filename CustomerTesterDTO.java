package com.xworkz.data;
import com.xworkz.data.DTO.CustomerDTO;

public class CustomerTesterDTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		CustomerDTO customerdto2=new CustomerDTO();
		customerdto2.setName("anusha");
		System.out.println(customerdto2.getName());
	
		CustomerDTO customerdto4=new CustomerDTO();
		customerdto4.setEmail("aishwarya77.xworkz@gmail.com");
		System.out.println(customerdto4.getEmail());
		
		CustomerDTO customerdto3=new CustomerDTO();
		customerdto3.setPhonenumber(9874568991l);
		System.out.println(customerdto3.getPhonenumber());
		
		CustomerDTO customerdto=new CustomerDTO();
		customerdto.setCustomerId(6789);
		System.out.println(customerdto.getCustomerId());
		
		
		
		
		
		
		
		

	}

}
