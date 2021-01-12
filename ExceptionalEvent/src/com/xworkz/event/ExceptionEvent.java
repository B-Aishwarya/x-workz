package com.xworkz.event;

public class ExceptionEvent {
	public ExceptionEvent() {
		System.out.println("created exceptional event");
	}
		private void createExceptionalEvent(boolean create) throws Throwable {
			System.out.println("invoked createExceptionalEvent");
			if (create) {
				System.out.println("creating exceptional event");
				Throwable throwable = new Throwable("exception is created");
				throw throwable;
			} else {
				System.out.println("no exceptional event is created");
			}
		}
		public void frame1()throws Throwable {
			System.out.println("frame1");
			this.frame2();
		}

		public void frame2()throws Throwable {
			System.out.println("frame2");
			this.frame3();
		}

		public void frame3()throws Throwable {
			System.out.println("frame3");
			this.frame4();
		}
		
		public void frame4() throws Throwable {
			System.out.println("frame4");
			this.frame5();
		}
		public void frame5() throws Throwable{
			this.createExceptionalEvent(true);
			
		
	}

}
