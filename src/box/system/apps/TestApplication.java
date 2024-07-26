package box.system.apps;
import box.ui.*;

public class TestApplication
{
	static ListView lst;
	static String[] array;
	public static void main(String[] args){
		String[] array = {"One", "Two", "three"};
		lst = new ListView(array);
		//normal list
		lst.show();
		//numbered list
		lst.showWithNumbers();
		// dividers in list
		lst.showWithDividers();
	}
}
