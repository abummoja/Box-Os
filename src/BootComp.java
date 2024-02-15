
import windroid.files.*;
import system.wintel.winlibs.*;
import system.wintel.*;

public class BootComp
{
	public static boolean sysTart;
	public static void main(String[] args){
		FileSystem.startFs();
		FileSystem.printName();
		sysTart = true;
		String[] apps = Installer.getAll();
		int al = apps.length;
		int i = 0;
		if(al == i){
			print("No apps installed");
		}else{
			print(al + " app(s) installed");
		}
		print("Disk size:"+FileSystem.rootDir.length()+" bytes");
		
	}
	static void print(Object obj){
		String str = obj.toString();
		Main.print(str);
	}
}
