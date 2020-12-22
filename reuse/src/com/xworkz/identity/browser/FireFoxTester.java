package com.xworkz.identity.browser;
import com.xworkz.identity.browser.Browser;
import com.xworkz.identity.browser.FirefoxBrowser;


public class FireFoxTester {
	public static void main(String[] args) {
    Object generic=new FirefoxBrowser();
	Browser browser=new FirefoxBrowser();
	
		FirefoxBrowser firefox=new FirefoxBrowser();
		generic=new String("test");
		if(generic instanceof FirefoxBrowser)
		{
			System.out.println("yes it is fire fox");
			FirefoxBrowser fireFoxCasted=(FirefoxBrowser)generic;
			System.out.println(firefox.getName());

		}
		else {
			System.out.println("it is not fire fox");
		}
		
		
		
	}

	}

