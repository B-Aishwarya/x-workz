enum IplTeam{
       RCB,SRH,MI,KKR,CSK
	}
	public class IplTester{

public static void main(String[] match)
{
	IplTeam{[] allTeams=IplTeam.values();
	System.out.println(allTeams.length);
	
	for(int initial=0;initial<allTeams.length;initial++){
		System.out.println("index " + initial);
		IplTeam matchValue=allTeams[initial];
		System.out.println("branch enum Value " + matchValue);
		
	}
}
