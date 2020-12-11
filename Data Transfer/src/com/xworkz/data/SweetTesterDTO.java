package com.xworkz.data;
import java.util.Arrays;

import com.xworkz.data.constants.Color;
import com.xworkz.data.constants.Shape;
import com.xworkz.data.dto.SweetDTO;

public class SweetTesterDTO {

	public static void main(String[] args) {
		Color[] color=new Color[2];
		color[0]=Color.YELLOW;
		color[1]=Color.WHITE;
		SweetDTO dto=new SweetDTO("champakali", 600, "benagal", Shape.RECTANGLE,color);
		System.out.println("sweet name is" +dto.getName());
		System.out.println("champakali price per kg is" +dto.getPrice());
		System.out.println("this sweet is famous in " +dto.getPopularState());
		System.out.println("champakali shape is" +dto.getShape());
		System.out.println("its color is"+Arrays.toString(dto.getColor()));
		}

}
