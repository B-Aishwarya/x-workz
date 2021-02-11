package com.xworkz.freedomFighters.dto;

public class FreedomFighterDTO {
	private String name;
	private String birthPlace;
	private Gender gender;

	public enum Gender {
		MALE, FEMALE
	}

	public FreedomFighterDTO(String name, String birthPlace, Gender gender) {
		super();
		this.name = name;
		this.birthPlace = birthPlace;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {

		return 777;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof FreedomFighterDTO) {
			FreedomFighterDTO casted = (FreedomFighterDTO) obj;
			if (casted.getName() != null && casted.getName().equals(this.getName())) {
				return true;
			}
		}
		return false;
	}

}
