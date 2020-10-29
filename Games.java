public class Games
{
	public static void main(String[] videogames){
				System.out.println("invoked main");
				playing("candycrush");
				playing("ludoking","candycrush");
				playing("carromking",17);
				playing(10,"pubg",30.8f,'A');
	}
	
	public static void playing(String pubg)
	{
		
		System.out.println("invoked playing");
		System.out.println("arg stories:  "+pubg);
		
	}
	public static void playing(String candycrush,String carromking)
	{
		System.out.println("invoked holding with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 candycrush   "+candycrush);
		System.out.println("arg2  carromking  "+ carromking);
		
	}
	
	public static void playing(String ludoking,int noOfPlayers)
	{
		
		System.out.println("invoked holding with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 ludoking "+ludoking);
		System.out.println("arg2  noOfPlayers   "+ noOfPlayers);
	}
	
	public static void playing(int noOfPlayers,String candycrush,float percentageOfPlaying,char winner)
	{
		System.out.println("invoked holding with two parameters ");
		System.out.println("int and String and float and character");
		System.out.println("arg1 noOfPlayers  "+noOfPlayers);
		System.out.println("arg2 candycrush  "+candycrush);
		System.out.println("arg3  percentageOfPlaying "+ percentageOfPlaying);
		System.out.println("arg4 winner  "+winner);


	}
	
	
	
}