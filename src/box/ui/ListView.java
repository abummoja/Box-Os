package box.ui;

public class ListView
{
	public static int i;
	public static String[] str;
	public ListView(){
		this.i = 0;
		String[] str = {"Item "+i};
		this.str = str;
	}
	public ListView(String[] str){
		this.str = str;
	}
	public static void showWithDividers(){
		for(String str : str){
			System.out.println(str);
			System.out.println("_____________");
		}
	}
	public static void show(){
		for(String st : str){
			System.out.println(st);
		}
	}
	public static void showWithNumbers(){
		for(String s : str){
			i++;
			System.out.println(i + " " + s);
		}
	}
	public static void add(String[] s){
		str = s;
	}
	public static void changeTo(String[] st){
		str = st;
	}
}
