public class Age
{
	
	public static String ageValue(int age)
	{
		System.out.println("invoked by age");
		System.out.println("age :"+age);
		
		if(age>=1 &&age<=5)
		{
			System.out.println("the return value is:" +age);
			return "kids";
		}
		
		if(age>=5 && age<=12)
		{
			System.out.println("the return value is:" +age);
			return "childrens";
		}
		
		if(age>=13 && age<=19)
		{
			System.out.println("the return value is:" +age);
			return "teenagers";
		}
		if(age>=20 && age<=50)
		{
			System.out.println("the return value is:" +age);
			return "adult";
		}
		
		
		if(age>=50 && age<=100)
		{
			System.out.println("the return value is:" +age);
			return "old";
		}
	return "age";
	}
}
	