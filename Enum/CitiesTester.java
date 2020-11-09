enum Cities
{
	BANGALORE,MUMBAI,DELHI,PUNE,HYDERABAD
	
}
public class CitiesTester{

public static void main(String[] test)
{
	
	String CitiesHyderabad="HYDERABAD";
	
	Cities convertedCitiesHyderabadFromString=Cities.valueOf(CitiesHyderabad);
	
	System.out.println( convertedCitiesHyderabadFromString);
	
	
	Cities[] allCities=Cities.values();
	System.out.println( allCities.length);

	for(int citiesInitial=0;citiesInitial<allCities.length;citiesInitial++){
		System.out.println("index " + citiesInitial);
		Cities  citiesValue=allCities[citiesInitial];
		System.out.println("Cities  enum Value " +citiesValue);
		
	}
	
	
	
}

}