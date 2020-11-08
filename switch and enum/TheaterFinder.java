public class TheaterFinder
{
	public static void bestTheaterUsingString(String theaterName)
    {
		System.out.println("Invoked bestTheaterUsingString");
		switch(theaterName)
		{
			case "nartaki":
			System.out.println("theater name::" +theaterName);
			break;
			
			case "pvr":
			System.out.println("theater name::" +theaterName);
			break;
			
			case "menaka":
			System.out.println("theater name::" +theaterName);
			break;
			
			default:
			System.out.println("Theater name not matched");
			
		}
		System.out.println("Exit::bestTheaterUsingString");
		
	}
	public static void bestTheaterUsingEnuum(Theater theaterName)
    {
		System.out.println("Invoked bestTheaterUsingEnuum");
		System.out.println(" argument::" +theaterName);
		switch(theaterName)
		{
			case MENAKA:
			System.out.println("theater name::" +theaterName);
			break;
			
			case PVR:
			System.out.println("theater name::" +theaterName);
			break;
			
			case CINIPOLIS:
			System.out.println("theater name::" +theaterName);
			break;
			
			
			
		}
		
		System.out.println("Exit::bestTheaterUsingEnuum");
	}
}
