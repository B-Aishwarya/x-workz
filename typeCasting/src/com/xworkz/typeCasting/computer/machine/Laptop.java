package com.xworkz.typeCasting.computer.machine;
import com.xworkz.typeCasting.computer.machine.Computer;

    public class Laptop extends Computer{
	private String osName;	
	
	public void runningOs(String osName) {
		System.out.println("osName " +osName);
		this.osName=osName;
		
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}
	

}
