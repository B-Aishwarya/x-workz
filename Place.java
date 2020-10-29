public class Place
{
	public static String placeFinder(int distance)
	{
		System.out.println("Invoked placeName()");
		System.out.println("distance::" +distance);
		
		
		if(distance==150)
		{
			System.out.println("Distance from  Bangalore to Mysore");
			return "Mysore";
			
		}
		if(distance==1500)
		{
			System.out.println("Distance from  Bangalore to Gujarath");
			return "Gujarath";
			
		}
		
		
		if(distance==1500)
		{
			System.out.println("place not in earth");
			return "place not in earth";
			
		}
		return "place not in earth";
		
	}
}