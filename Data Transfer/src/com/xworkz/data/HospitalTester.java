package com.xworkz.data;
import com.xworkz.data.dto.AppointmentDTO;
import com.xworkz.data.dto.Hospital;

public class HospitalTester {

	public static void main(String[] args) {
		Hospital hospital=new Hospital("SDM","Dharwad",1000);
		System.out.println("hospital name is " +hospital.getName());
		System.out.println("hospital name is"  +hospital.getLocation());
		System.out.println("hospital name is"  +hospital.getNoOfAppointments());
		System.out.println("****************************************");
		
		
		hospital.appointment("preeti","headacge","23",9870656789l,"Dr vishalaxi");	
		AppointmentDTO appointmentDTO=hospital.getAppointmentmentDTO();
		System.out.println("Patient name "  +appointmentDTO.getPatientName());
		System.out.println("DoctorName is" +appointmentDTO.getDoctorName());
		System.out.println("Patience phone number is" +appointmentDTO.getPhoneNumber());
		
		
		

	}

}
