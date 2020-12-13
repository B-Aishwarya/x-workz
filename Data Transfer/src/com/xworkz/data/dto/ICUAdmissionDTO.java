package com.xworkz.data.dto;

public class ICUAdmissionDTO {
	private String patientName;
	private String siverity;
	private int age;
	private String doctorName;
	private String nurseName;
	
	
	public ICUAdmissionDTO() {
	
	}
	
	
  


	public ICUAdmissionDTO(String patientName, String siverity, int age, String doctorName, String nurseName) {
		super();
		this.patientName = patientName;
		this.siverity = siverity;
		this.age = age;
		this.doctorName = doctorName;
		this.nurseName = nurseName;
	}





	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public String getSiverity() {
		return siverity;
	}


	public void setSiverity(String siverity) {
		this.siverity = siverity;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getNurseName() {
		return nurseName;
	}


	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}
	

}