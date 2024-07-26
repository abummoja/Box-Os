package box;
import java.lang.reflect.*;
import java.util.function.*;

abstract class Application
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
	}
	public void stopApp(){
		// when stopped
	}
	public static void getName(){
		
	}
}
