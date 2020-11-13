package place;

public class PlaceFinder {
	private static String[] places={ "mysore", "bangalore", "hubli", "dandeli", "laxmeshwar", "Goa", "mumbai",
			"delhi","hyderabad","kashmir","chennai","rajastan","punjab"};
	
	
	public static void search(String city) {
		System.out.println("Total items available" + places.length);
		System.out.println("arg1 :" +city);
		boolean placeFound = false;
		for (int count = 0; count <places.length; count++) {
		
			String place=places[count];
			if (place.equals(city)) {
			
				 placeFound = true;
				break;
			} else {
				
				 placeFound = false;
			}

		}

		if ( placeFound) {
			System.out.println("place is found ");
		} else {
			System.out.println("place is not found");
		}
		System.out.println("search nirgamana");

	}

	public static int totalplaceFound() {
		return places.length;
	}

}
