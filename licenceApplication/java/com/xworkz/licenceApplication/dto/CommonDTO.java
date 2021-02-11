package com.xworkz.licenceApplication.dto;
import java.util.Date;
import com.xworkz.licenceApplication.constants.BloodGroup;
import com.xworkz.licenceApplication.constants.Gender;

public class CommonDTO extends AddressDTO {
    private int age;
    private Date dob;
	private AddressDTO adress;
	private BloodGroup bloodGroup;
	private Gender gender;
	
	public CommonDTO() {
		System.out.println("init CommonDTO");
	}

	public CommonDTO(int age, Date dob, AddressDTO adress, BloodGroup bloodGroup, Gender gender) {
		super();
		this.age = age;
		this.dob = dob;
		this.adress = adress;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public AddressDTO getAdress() {
		return adress;
	}

	public void setAdress(AddressDTO adress) {
		this.adress = adress;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "CommonDTO [age=" + age + ", dob=" + dob + ", adress=" + adress + ", bloodGroup=" + bloodGroup
				+ ", gender=" + gender + "]";
	}

	
	
	

}
