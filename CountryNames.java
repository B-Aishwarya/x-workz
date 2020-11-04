public class CountryNames{



   public static void main(String[] countrynames)
   {
	   
	   System.out.println("JVM invoked main");
	   
	   System.out.println("Printing all the names of country");
	   System.out.println("By passing argument at main method  and printing using for loop");
	   for(int loop=0;loop<countrynames.length;loop++)
	   {
		   System.out.println("looping number"+loop);
		   String mainMethodArg=countrynames[loop];
		   System.out.println("mainMethodArg "+mainMethodArg);
	   }
	   
	   
	   System.out.println("EXIT  :: main");
	   
   }

}