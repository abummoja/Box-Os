package windroid.ui.icon;

public class Icon
{
	public static int ic;
	
	public Icon(int ic){
		this.ic = ic;
	}
	public Icon(){
		this.ic = 7;
	}
	public static int getIcon(){
		return ic;
	}
	public void setIcon(int ic){
		this.ic = ic;
	}
	public static void show(){
		System.out.print("\n");
		System.out.format("[ %s ]", ic);
		System.out.println("\n");
	}
}
