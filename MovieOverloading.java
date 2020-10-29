public class MovieOverloading
{
	
	public static void kannadamovie(String kgf)
	{
		
		System.out.println("invoked kannadamovie");
		System.out.println("arg thing: "+kgf);
		
	}
	
	public static void kannadamovie(String hindimovie,String chhapaak)
	{
		System.out.println("invoked holding with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 hindimovie"  +  hindimovie);
		System.out.println("arg2 chhapaak"+ chhapaak);
		
	}
	
	public static void kannadamovie(String  minnale,int relesedYear)
	{
		
		System.out.println("invoked holding with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 minnale" +  minnale);
		System.out.println("arg2 relesedYear" +  relesedYear);
	}
	
	public static void kannadamovie(int relesedYear,String minnale)
	{
		System.out.println("invoked holding with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 relesedYear"  +  relesedYear);
		System.out.println("arg2 minnale"  +  minnale);
		
	}
	
	
	
}
