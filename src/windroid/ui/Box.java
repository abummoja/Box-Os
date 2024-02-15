package windroid.ui;

public class Box
{
	static String borderTop = "__";
	static String borderSides = "|";
	static String ctnt;
	public Box(){
		
	}
	public Box(String borderTop, String borderSides, String ctnt){
		this.borderSides = borderSides;
		this.borderTop = borderTop;
		this.ctnt = ctnt;
	}
	public static void create(int h, int w){
		System.out.println("\n");
		for(int i = 0; i < w;i++){
			System.out.print(borderTop);
		}
		for(int i = 0; i < h;i++){
			System.out.format("\n"+borderSides + " %s "+ borderSides+"\n", ctnt);
		}
		for(int i = 0; i < w;i++){
			System.out.print(borderTop);
		}
		System.out.println("\n");
	}
}
