public class NovelsTester{

public static void main(String[] no)
{
	
	String novelIndia2020="INDIA2020";
	
	Novels convertedIndia2020FromString=Novels.valueOf(novelIndia2020);
	
	System.out.println(convertedIndia2020FromString);
	
	
	Novels[] allNovels =Novels.values();
	System.out.println(allNovels.length);
	//length will be +1 of index
	for(int novelsInitial=0;novelsInitial<allNovels.length;novelsInitial++){
		System.out.println("index " + novelsInitial);
		Novels novelsValue=allNovels[novelsInitial];
		System.out.println("Novels enum Value " + novelsValue);
		
	}
	
	
	
}

}
