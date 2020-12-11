package com.xworkz.data.dto;
import com.xworkz.data.dto.Hospital;
import com.xworkz.data.HospitalTester;

public class AppointmentDTO {
	private String patientName;
	private String reason;
	private long phoneNumber;
	private String doctorName;
	String age;
	
	public AppointmentDTO (String patientName,String reason,String age, long phoneNumber,String doctorName) {
		this.patientName=patientName;
		this.doctorName=doctorName;
		this.patientName=patientName;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.doctorName=doctorName;
		
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
		
}
