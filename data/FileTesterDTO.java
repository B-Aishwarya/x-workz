package com.xworkz.data;
import java.util.Date;
import com.xworkz.data.DTO.FileDTO;

public class FileTesterDTO {

	public static void main(String[] args) {
		FileDTO dto=new FileDTO("images", 123.00);
		System.out.println(dto.getName());
		System.out.println(dto.getSize());
		dto.setName("img");
		dto.setSize(21.00);
		System.out.println(dto.getName());
		System.out.println(dto.getSize());
		
		
		FileDTO dto1=new FileDTO(".java");
		System.out.println(dto1.getType());
		dto1.setType("text");
		System.out.println(dto1.getType());
	
		
		Date date=new Date();
		System.out.println(date);
		
		

	}

}
