package windroid.ui.widgets.advanced;

public class ListView
{
	static String marker;
	static String[] array;
	String[] sarr = {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
	public ListView()
	{
		this.marker = "- ";
		this.array = sarr;
		//empty constructor
	}
	public ListView(String marker, String[] array)
	{
		this.marker = marker;
		this.array = array;
	}
	public ListView(String[] array){
		this.array = array;
	}
	public static void show()
	{
		int x = array.length;
		for (String str: array)
		{
			System.out.println(marker + str);
		}
	}
	public static void list()
	{
		int i = 0;
		for (String str:array)
		{
			i += 1;
			System.out.println(i + ": " + str);
		}
	}
}
