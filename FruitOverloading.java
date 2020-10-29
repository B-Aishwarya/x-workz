public class FruitOverloading
{
	
	
	public static void eating(String sweet)
	{
		
		System.out.println("invoked eating");
		System.out.println("arg thing: "+sweet);
		
	}
	
	public static void eating(String berries,String typesOfberries)
	{
		System.out.println("invoked holding with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 berries"+    berries);
		System.out.println("arg2 typesOfberries"+  typesOfberries);
		
	}
	
	public static void eating(String apple,int costPerKg)
	{
		
		System.out.println("invoked holding with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 apple"+   apple);
		System.out.println("arg2 costPerKg"+   costPerKg);
	}
	
	public static void eating(int costPerKg,String apple)
	{
		System.out.println("invoked holding with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 costPerKg"+   costPerKg);
		System.out.println("arg2 apple"+ apple);
		
	}
	
		public static void eating(int costPerKg,String fruits,float weightOfFruit)
	{
		System.out.println("invoked holding with two parameters ");
		System.out.println("int and String and float");
		System.out.println("arg1 costPerKg  "+costPerKg);
		System.out.println("arg2 fruits   "+fruits);
		System.out.println("arg3 weightOfFruit  "+weightOfFruit);

	}
	
	
	
}