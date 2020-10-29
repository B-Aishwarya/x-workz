public class MovieNameTester{


public static void main(String[] somethings)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length"+somethings.length);	
        
		
		Movie.kannadamovie("films");

		Movie.kannadamovie(" movie",2010);
		
		Movie.kannadamovie(" name","hindimovie");
		Movie.kannadamovie("films",2010);


	System.out.println("EXIT :: main");	
}

}
