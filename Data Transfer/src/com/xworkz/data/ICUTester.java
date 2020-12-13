package com.xworkz.data;

import com.xworkz.data.dto.ICU;
import com.xworkz.data.dto.ICUAdmissionDTO;

public class ICUTester {
	public static void main(String[] args) {
		ICU icu=new ICU(true,2000,true);
		icu.admissionDetailes("ashwini", "corona", 30, "Dr Naveen chandra", "Jayalaxmi");
		ICUAdmissionDTO dto=icu.getAdmissionDTO();
		System.out.println("patient name "+dto.getPatientName());
		System.out.println("doctor assigned "+dto.getDoctorName());
		System.out.println("severity "+dto.getSiverity());
		System.out.println("patient Age is "+dto.getAge());
		System.out.println("NurseName is "+dto.getNurseName());
		icu.updateDoctor("Aishwarya B");
		System.out.println("updated doctor name "+dto.getDoctorName());
		
		
		
	
		
	}

}
