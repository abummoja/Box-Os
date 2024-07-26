package box;
import java.lang.reflect.*;
import java.util.function.*;

public abstract class Application
{
	public static boolean isRunning;
	public static String name;
	public static String developer;
	public static String manifest;
	
	public Application(String name, String developer, String manifest, boolean isRunning){
		this.name = name;
		this.developer = developer;
		this.manifest = manifest;
		this.isRunning = isRunning;
	}
	public void startApp(){
		//when app started
		System.out.println(name);
		if(isRunning) {
			//check state [App reported]
			//log
		}
	}
	public void stopApp(){
		// when stopped
	}
	public String getName(){
		return name;
	}
}
