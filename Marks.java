public class Marks
{
	public static void main(String[] args)
	{
		System.out.println("invoked by JVM");
		String Percentage=result(85);
		System.out.println("the result:" +Percentage);
	}
	
	
	public static String result(double percentage)
	{
		System.out.println("invoked by main method");
		System.out.println("the result percentage is:" +percentage);
		
		
		if(percentage>=85 && percentage<=100)                               
		
	
		{
			 System.out.println("The return value is :"+percentage);
			 return "Destinction";
		}
		
		if(percentage>=65 && percentage<=84)
		{
			System.out.println("The return is:"+percentage);
			return "First class";
		}
		
		if(percentage>=45 && percentage<=64)
		{
			System.out.println("The return is:"+percentage);
			return "Second class";
		}
		
		if(percentage>=35 && percentage<=44)
		{
			System.out.println("The return is:"+percentage);
			return "pass";
		
		}
		if(percentage<=35)
		{
			System.out.println("The return is:"+percentage);
			return "fail";
		}
	
	return "value";
	}
	
}
