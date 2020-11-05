public class CountryTest{
	public static void main(String[] args){
		System.out.println("use of fields");
		
		
	     String state=Country.myState;
		System.out.println("mystate name   "+state);
		state="goa";
		System.out.println("updatedStates is   "+state);
		
	
	    byte nostates=Country.noOfStates;
		System.out.println("no of states   "+nostates);
		nostates=29;
		System.out.println("updated no of States is   "+nostates);
		
		
		
		
	    short nodist=Country.noOfDistrict;
		System.out.println("no of states   "+nodist);
		nodist=300;
		System.out.println("updated noOfDistrict is   "+nodist);
		
		 String name=Country.countryName;
		System.out.println("countryName   "+name);
		name="Pakistan";
		System.out.println("updatedStates is   "+name);
		
		 int areastates=Country.areaOfState;
		System.out.println("no of states   "+areastates);
		areastates=29;
		System.out.println("updated no of States is   "+areastates);
		
		

	}
}