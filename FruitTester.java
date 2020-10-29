public class FruitTester{


public static void main(String[] somethings)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length"+somethings.length);	
        
		
		FruitOverloading.eating("sweet");
		FruitOverloading.eating("fruits","apple");

		FruitOverloading.eating("fruits",10);
		
		FruitOverloading.eating(2,"apple",0.24f);
		FruitOverloading.eating(2,"fruits");


	System.out.println("EXIT :: main");	
}

}
