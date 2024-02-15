package devTo.privapps;
import windroid.ui.widgets.*;

public class ChatBot
{
	static TextInput input;
	static String unam = "\u0090 \u0040 unam.Chat";
	static  String hello = "Hello";
	
	public static void main(String[] args){
		TextView tv = new TextView("Enter name: ");
		tv.show();
		unam = (TextInput.scan());
		System.out.println(unam);
		String msg = TextInput.scan();
		if(msg == "hello"){
			System.out.println("hi too");
		}
		
	}
	
	static void chat(){
		//chat with user:
	}
	
	static String User(){
		return unam;
	}
}
