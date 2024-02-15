package windroid.ui.widgets;

public class TextView
{
	static String text;
	public TextView(){
		//requires empty constructor
	}
	public TextView(String text){
		this.text = text;
	}
	public static void show(){
		System.out.print(text);
	}
}
