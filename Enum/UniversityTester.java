 enum University 
{
	OXFORD,CAMBRIDGE,STANFORD,HARVARD,CALIFORNIA
	
}
public class UniversityTester{

public static void main(String[] test)
{
	
	String universityHarvard="HARVARD";
	
	University converteduniversityHarvardFromString=University.valueOf(universityHarvard);
	
	System.out.println(converteduniversityHarvardFromString);
	
	
	University[] allUniversity  =University .values();
	System.out.println(allUniversity .length);

	for(int universityInitial=0;universityInitial<allUniversity .length;universityInitial++){
		System.out.println("index " + universityInitial);
		University  universityValue=allUniversity [universityInitial];
		System.out.println("University  enum Value " + universityValue);
		
	}
	
	
	
}

}
