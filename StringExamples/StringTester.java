package basics;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String country="India";
    boolean empty=country.isEmpty();
    System.out.println(empty);
    String upperCase=country.toUpperCase();
    System.out.println(upperCase);
    char value=upperCase.charAt(3);
    System.out.println(value);
    String name=country.toLowerCase();
    System.out.println(name);
    if(country==upperCase)
    {
    	System.out.println("Both string are equal");
    }
    else
      {
    		System.out.println("Both string are not equal");
    		
    }
    
    
	}

}
