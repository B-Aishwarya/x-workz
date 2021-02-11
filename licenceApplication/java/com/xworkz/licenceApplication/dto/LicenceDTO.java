package com.xworkz.licenceApplication.dto;

import java.util.Date;

import com.xworkz.licenceApplication.constants.BloodGroup;
import com.xworkz.licenceApplication.constants.Gender;
import com.xworkz.licenceApplication.constants.IdProof;
import com.xworkz.licenceApplication.constants.VehicleType;

public class LicenceDTO extends CommonDTO {
	private String idProof;
	private VehicleType vehicleType;
	private Date startDate;

	public LicenceDTO() {

	}

	public LicenceDTO(String idProof, VehicleType vehicleType, Date startDate) {
		super();
		this.idProof = idProof;
		this.vehicleType = vehicleType;
		this.startDate = startDate;
	}

	public LicenceDTO(int age, Date dob, AddressDTO adress, BloodGroup bloodGroup, Gender gender) {
		super(age, dob, adress, bloodGroup, gender);

	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "LicenceDTO [idProof=" + idProof + ", vehicleType=" + vehicleType + ", startDate=" + startDate + "]";
	}

}
