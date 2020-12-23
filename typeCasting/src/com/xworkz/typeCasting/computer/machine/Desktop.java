package com.xworkz.typeCasting.computer.machine;

import com.xworkz.typeCasting.computer.machine.Computer;

public class Desktop extends Computer {
	private int memorySize;

	public void update(String softwareName, double softwareVersion) {
		System.out.println("init update");
		System.out.println("softwareName : " + softwareName);
		System.out.println("softwareVersion : " + softwareVersion);

	}

}
