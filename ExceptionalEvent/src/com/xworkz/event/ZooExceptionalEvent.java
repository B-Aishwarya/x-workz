package com.xworkz.event;

public class ZooExceptionalEvent {

	public ZooExceptionalEvent() {
		System.out.println("created Zoo Exceptional Event");
	}

	public void createZooException(boolean create) throws Throwable {

		System.out.println("init zoo exception");
		if (create) {
			System.out.println("created zoo exception");
			Throwable throwable = new Throwable();
			throw throwable;
		} else {
			System.out.println("zoo exception is not created");
		}
	}

	public void frame1() throws Throwable {
		System.out.println("frame1");
		this.frame2();
	}

	public void frame2() throws Throwable {
		System.out.println("frame2");
		this.frame3();
	}

	public void frame3() throws Throwable {
		System.out.println("frame3");
		this.frame4();
	}

	public void frame4() throws Throwable {
		System.out.println("frame4");
		this.frame5();
	}

	public void frame5() throws Throwable {
		this.createZooException(true);

	}
}