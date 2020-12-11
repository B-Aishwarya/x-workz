package com.xworkz.data.dto;
import com.xworkz.data.HospitalTester;
import com.xworkz.data.dto.AppointmentDTO ;


public class Hospital {
	private String name;
	private String location;
	private int noOfAppointments=10;
	private AppointmentDTO appointmentmentDTO;
	
	
	
	public Hospital(String name, String location, int noOfAppointments) {
		
		this.name = name;
		this.location = location;
		this.noOfAppointments = noOfAppointments;
	}
	  
	
	public void  appointment( String patientName,String reason,String age, long phoneNumber,String doctorName) {
		this.appointmentmentDTO=new AppointmentDTO(patientName,reason,age, phoneNumber,doctorName);
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getNoOfAppointments() {
		return noOfAppointments;
	}


	public void setNoOfAppointments(int noOfAppointments) {
		this.noOfAppointments = noOfAppointments;
	}


	public AppointmentDTO getAppointmentmentDTO() {
		return appointmentmentDTO;
	}


	public void setAppointmentmentDTO(AppointmentDTO appointmentmentDTO) {
		this.appointmentmentDTO = appointmentmentDTO;
	}
	


	


	
	

}
