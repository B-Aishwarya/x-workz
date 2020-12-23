package com.xworkz.typeCasting.computer.machine;

public class Computer {
	private int screenSizes;
	private String computerType;

	public void computerFeatures(int screenSizes, String computerType) {
		this.screenSizes = screenSizes;
		this.computerType = computerType;

	}

	public void onOrOff() {
		System.out.println("init on or off");
	}

	public void filemanagement() {
		System.out.println("init filemanagement");

	}

	public int getScreenSizes() {
		return screenSizes;
	}

	public void setScreenSizes(int screenSizes) {
		this.screenSizes = screenSizes;
	}

	public String getComputerType() {
		return computerType;
	}

	public void setComputerType(String computerType) {
		this.computerType = computerType;
	}

}
