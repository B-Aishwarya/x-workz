enum Chats
{
	SAMOSA,KACHORI,GOBIMANCHURY,GOLIBAJJI,PAVBHAJI
	
}
public class ChatsTester{

public static void main(String[] test)
{
	
	String ChatsKachori="KACHORI";
	
	Chats convertedChatsKachoriFromString=Chats.valueOf(ChatsKachori);
	
	System.out.println(convertedChatsKachoriFromString);
	
	
	Chats[] allChats=Chats.values();
	System.out.println(allChats.length);

	for(int chatsInitial=0;chatsInitial<allChats.length;chatsInitial++){
		System.out.println("index " + chatsInitial);
		Chats  chatsValue=allChats[chatsInitial];
		System.out.println("Chats  enum Value " +chatsValue);
		
	}
	
	
	
}

}