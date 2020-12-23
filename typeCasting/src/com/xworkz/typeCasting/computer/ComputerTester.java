package com.xworkz.typeCasting.computer;
import com.xworkz.typeCasting.computer.machine.Computer;
import com.xworkz.typeCasting.computer.machine.Desktop;
import com.xworkz.typeCasting.computer.machine.Laptop;

public class ComputerTester {

	public static void main(String[] args) {
		Computer computer=new Desktop();
		Desktop childRef=(Desktop)computer;
		Desktop desktop=new Desktop();
		desktop.setComputerType("Screen Touch");
		System.out.println("ComputerType is "+desktop.getComputerType());
		desktop.setScreenSizes(19);
		System.out.println("ScreenSizes is "+desktop.getScreenSizes());
		childRef.update("Eclipse IDE",4.18);
		
        Laptop laptop=new Laptop();
        laptop.setOsName("Apple macOS"); 
        laptop.runningOs("Apple macOS");
        laptop.filemanagement();
        laptop.onOrOff();
        
         
	   Computer com=new Laptop();
	   com=new Desktop();
	   
	   if(com instanceof Laptop) {
		   System.out.println("yes laptop is a instance of computer");
		   Laptop lapi=(Laptop)com;
	   }
	   else {
		   System.out.println("no laptop is not instance of computer");
	   }
}
}