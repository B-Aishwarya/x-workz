package com.xworkz.strings.stringMethods;
/**
 * 
 * @author Aishwarya B
 *
 */
public class StringTypes {
	public static void main(String[] args) {
		/**
		 *Finding the length of the string using string.lenth 
		 */
		String string=new String("this is the first string");
		String string2=new String("this is second String");
        System.out.println("first String Length :"+string.length() );
	    System.out.println("second String length is"+string2.length());
        /**
        * This method returns the character located at the String's 
        * specified index. 
        */
	    String stringAtPosition = "Strings are immutable";
        char result = stringAtPosition.charAt(8);
        System.out.println("char At position 8 is:"+result);
	/**
	 * CharArray() method converts this string into character array.
	 */
        String msg="hello good morning";  
        char[] value=msg.toCharArray();  
        for(int i=0;i<value.length;i++){  
        System.out.println(value[i]);  
        }  
        
        
        // Boolean object 
        Boolean a = new Boolean(true); 
  
        // Boolean object 
        Boolean b = new Boolean(true); 
  
        // compare method 
        System.out.println(a + " comparing with " + b 
                           + " = " + a.equals(b)); 
        
        /**
         * Checking the string IsEmpty or not
         */
        String s1="XworkZ";  
        String s2="";  
          
        System.out.println(s1.isEmpty());  
        System.out.println(s2.isEmpty());  
   /**
    *  converts all of the characters in this String to upper case.
    */
        String Str = new String("Welcome to XworkZ Odc.com");
        System.out.print("UpperCase Value is :" );
        System.out.println(Str.toUpperCase() );
        
       /**
        * converts all of the characters in this String to LowerCase. 
        */
        
        String St = new String("Welcome to XworkZ Odc.com");
        System.out.print("LowerCase Value is:");
        System.out.println(St.toLowerCase());
   
        /**Compare two strings
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        System.out.println(myStr1.compareTo(myStr2));
        
        /**
         * Compare two strings, ignoring lower case and upper case differences:
         */
        String hi1 = "HELLO";
        String hi2 = "hello";
        System.out.println( hi1.compareToIgnoreCase(hi2));
        
        /**
         * endsWith() method checks whether a string ends with the specified 
         * characters
         */
        String myStr = "Hello";
        System.out.println(myStr.endsWith("Hel"));   
        System.out.println(myStr.endsWith("llo"));   
        System.out.println(myStr.endsWith("o"));   
        
        
        /**
         * Return a String that represents certain characters of a char array:
         */
        char[] copy = {'H', 'e', 'l', 'l', 'o'};
        String copy2 = "";
        copy2 = copy2.copyValueOf(copy, 0, 5);
        System.out.println("Returned String: " + copy2);
        
        /**
         * Return the uni code of the first character in a string
         */
        String s = "Hello";
        int sr = s.codePointAt(0);
        System.out.println(sr);

       /**
        * checks the last index
        */
        
        String text = "Hello planet earth, you are a great planet.";
        System.out.println(text.lastIndexOf("planet"));

	/**
	 * The startsWith() method checks whether a string starts with the 
	 * specified character(s).
	 */
	String print = "Hello";
	System.out.println(print.startsWith("Hel"));   
	System.out.println(print.startsWith("llo"));   
	System.out.println(myStr.startsWith("o")); 
	/**
	 * Remove whitespace from both sides of a string:
	 */
	String type = "     Hello World   ";
	System.out.println(type);
	System.out.println(type.trim());
}
}