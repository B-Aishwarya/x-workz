package com.xworkz.identity.browser;
import com.xworkz.identity.browser.Browser;


public class BrowserTester {
	public static void main(String[] args) {	
		Browser browser = new Browser();
		browser.setName("IE");
		
		Object genericBrowser=new Browser();

		Browser childRef=(Browser)genericBrowser;
		childRef.setName("chrome");
		System.out.println("updated browser name is"+childRef.getName());
		
		
		Object day= new String("WEDNESDAY");
		String string=(String)day;
		
		
		
		
		
		
		
	}

}
