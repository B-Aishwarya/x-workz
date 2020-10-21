public class Percentage{
	public static void main(String args[])
	{
		System.out.println("percentages:");
		arrayOfPercentages();
	}
	   public static void arrayOfPercentages(){
		   System.out.println("invoking arrayOfPercentages");
		double sslcPercentage=80.96d;
		double pucPercentage=60.05d;
		double degreePercentages=6.13d;
		double[] percentages={sslcPercentage,pucPercentage,degreePercentages};
		int sizeOfArray=percentages.length;
		System.out.println("all element" + sizeOfArray );
		
	     double elementAtIndex2=percentages[0];
		 
		 System.out.println("Element at index two "+elementAtIndex2);
		 
		 double elementAtIndex1=percentages[1];
		 
		 System.out.println("Element at index one "+elementAtIndex1);
		 
		double elementAtIndex3=percentages[2];
		 
		 System.out.println("Element at index three"+elementAtIndex3);
	
	}
	
	
	
}