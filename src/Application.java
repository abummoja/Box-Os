
import windroid.files.*;
import system.wintel.*;
import java.io.*;
import java.util.*;
import windroid.ui.icon.*;

public class Application
{
	public static String[] permision = {};
	public static String name, developer, company;
	public static String path;
	public static Icon icon = new Icon(7);
	public Application(Icon icon, String name, String developer, String company, String path){
		this.icon = icon;
		this.name = name;
		this.company = company;
		this.developer = developer;
		this.path = path;
	}
	public Application(){
		this.path = FileSystem.filesDir.toString();
		String[] otr = Installer.getAll();
		int i = otr.length;
		int j = i+=1;
		this.name = "App"+j;
		this.icon = icon;
		this.company = "null";
		this.developer = "anonymous";
	}
	public void setIcon(Icon icon){
		this.icon = icon;
	}
	public Icon getIcon(){
		return icon;
	}
	public String getName(){
		return name;
	}
	public static void main(String[] args){
		String[] sa = Installer.getAll();
		int i = sa.length;
	}
}
