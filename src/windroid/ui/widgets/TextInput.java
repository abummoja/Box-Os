package windroid.ui.widgets;
import java.util.*;

public class TextInput extends TextView
{
	static char[] string;
	static int len = 250;
	String defstr = "Text";
	public TextInput()
	{
		char[] dc = defstr.toCharArray();
		this.string = dc;
		//empty;
	}
	public TextInput(char[] string)
	{
		this.string = string;
	}
	public TextInput(char[] string, int len)
	{
		this.string = string;
		this.len = len;
	}
	public void setMax(int max)
	{
		this.len = max;
	}
	public static String scan()
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = s.length();
		i = len;
		return s;
	}
	public int length(){
		return scan().length();
	}
	public static void show(){
		char[] str = scan().toCharArray();
		for(char c : str){
			System.out.print(c);
		}
	}
	public String getValue(){
		return scan();
	}
}
