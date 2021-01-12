package com.xworkz.exceptionalTester;
import com.xworkz.event.ZooExceptionalEvent;
public class ZooExceptionTester {

	public static void main(String[] args) throws Throwable {
		ZooExceptionalEvent event=new ZooExceptionalEvent();
		event.frame1();
	}

}
