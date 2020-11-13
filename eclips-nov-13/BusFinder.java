package place;

public class BusFinder {
	private static String[] bus={ "rajahamsa", "vrl", "karona", "KSRTC", "airavata"};
	
	
	public static void search(String busses) {
		System.out.println("Total bus available" +bus.length);
		System.out.println("arg1 :" +busses);
		boolean busFound = false;
		for (int count = 0; count <bus.length; count++) {
		
			String busname=bus[count];
			if (bus.equals(busses)) {
			
				busFound = true;
				break;
			} else {
				
				busFound = false;
			}

		}

		if ( busFound) {
			System.out.println("bus is found ");
		} else {
			System.out.println("bus is not found");
		}
		System.out.println("search nirgamana");

	}

	public static int totalbussesFound() {
		return bus.length;
	}


}
