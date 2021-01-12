package com.xworkz.exception.dto;

public class PalaceDTO implements Cloneable {
	private String location;
	private String kingName;
	private String queenName;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getKingName() {
		return kingName;
	}
	public void setKingName(String kingName) {
		this.kingName = kingName;
	}
	public String getQueenName() {
		return queenName;
	}
	public void setQueenName(String queenName) {
		this.queenName = queenName;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public int hashCode() {
		return 45;
	}
	@Override
	public PalaceDTO clone() throws CloneNotSupportedException {
		PalaceDTO dto=new PalaceDTO();
		dto.kingName=kingName;
		dto.queenName=queenName;
		dto.location=location;
		return dto;
	}
	

}
