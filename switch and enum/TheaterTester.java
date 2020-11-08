public class TheaterTester
{
	public static void main(String[] test)
	{
		System.out.println("JVM invoked main");
		TheaterFinder.bestTheaterUsingString("nartaki");
		
		String testEnum="NARTAKI";
		Theater enumTheaterName=Theater.valueOf(testEnum);
		TheaterFinder.bestTheaterUsingEnuum(enumTheaterName);
		System.out.println("Exit:main");
		
	}
}