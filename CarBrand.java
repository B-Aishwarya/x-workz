public class CarBrand{
	public static String[] getBrands()
	{
		String[] namesOfBrand={"Lamborgini","Audi","Bugatti","MarutiSuzuki","Rolls royse","ferrari"};	
		
		System.out.println("NamesOfBrand size"+namesOfBrand.length);
		
		for(int brand=0;brand<namesOfBrand.length;brand++)
		{
			System.out.println("brand "+brand);
			String brandNames=namesOfBrand[brand];
			System.out.println("brandName "+ brandNames);
		}
		return namesOfBrand;
		
	}
}
