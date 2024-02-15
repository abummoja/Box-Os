package windroid.ui.window;

import Application;
import windroid.ui.*;

public class TittleBar
{
	static String ttl;
	public static Application app;
	static Box box;
	public TittleBar(){
		//empty
		this.ttl = app.getName();
	}
	public TittleBar(String ttl){
		this.ttl = ttl;
	}
	public TittleBar(String ttl, Application ap){
		this.ttl = ttl;
		String str = ap.getName();
		this.ttl = str +" - "+ ttl;
	}
	public static void create(){
		box = new Box("_", "|", ttl);
		box.create(1, 20);
	}
}
