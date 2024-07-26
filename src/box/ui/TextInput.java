package box.ui;
import java.io.Console;
import java.util.Scanner;
public class TextInput implements Print
{
	Scanner scn = new Scanner(System.in);
	public String inputStr;
	public int inpInt;
	public TextInput(String hint, String type) {
		if(hint!=null)
			out(hint);
		switch(type.toLowerCase()) {
			case "number":
				int num = scn.nextInt();
				inpInt = num;
				break;
			case "text":
				String st = scn.next();
				inputStr = st;
				break;
			case "password":
				inputStr = readPassword();
				break;
			default:
				String defStr = scn.next();
				inputStr = defStr;
				return;
		}
	}
	public String readPassword() {
		// TODO Auto-generated method stub
		Console mConsole = System.console();
		if(mConsole!=null) {
			char[] mPassArray = mConsole.readPassword();
			return new String(mPassArray);
		}else {
			Scanner pScn = new Scanner(System.in);
			StringBuilder password = new StringBuilder();
			while(true) {
				char mChar = pScn.next().charAt(0);
				if(mChar == '\n'||mChar=='\r') {
					break;
				}password.append(mChar);
				out("*");
			}out("\n");return password.toString();
		}
	}
	
}