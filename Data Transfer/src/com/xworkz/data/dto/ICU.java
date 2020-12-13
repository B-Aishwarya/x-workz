package com.xworkz.data.dto;


public class ICU {
	private boolean ventilator;
	private int costPerDay;
	private boolean tv;
	private ICUAdmissionDTO admissionDTO;
	
	public ICU() {
	System.out.println("created ICUAdmissionDTO");
	}
	
	
	public ICU(boolean ventilator, int costPerDay, boolean tv) {
		super();
		this.ventilator = ventilator;
		this.costPerDay = costPerDay;
		this.tv = tv;
		this.admissionDTO = admissionDTO;
	}
	
	
	 public void admissionDetailes(String patientName, String severity, int age, 
			 String doctorName, String nurseName) {
		 if(patientName !=null && severity !=null && doctorName !=null  && nurseName !=null) {
			 
			this.admissionDTO=new ICUAdmissionDTO(patientName,severity,age,doctorName,nurseName);
		}
		 
	 }
	 
	 public void updateDoctor(String newDoctorName) {
			this.admissionDTO.setDoctorName("varsha");
		}
		public ICUAdmissionDTO getAdmissionDTO() {
			return admissionDTO;
		}

	
	 
	 
	 
	
}
