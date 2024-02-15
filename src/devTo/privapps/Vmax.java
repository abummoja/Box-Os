package devTo.privapps;

import java.io.*;
import system.wintel.*;
import windroid.ui.*;
import Application;
import windroid.ui.icon.*;
import windroid.files.*;
import windroid.utils.*;
import java.util.*;
import windroid.ui.widgets.advanced.*;
import windroid.ui.window.*;
import system.wintel.winlibs.*;
import windroid.ui.widgets.*;

public class Vmax extends Application
{
	public static void main(String[] args){
		TittleBar tb;
		Box bx = new Box("[", "\\", "Vm");
		bx.create(1, 3);
		Box.create(1, 2);
		String[] apps = Installer.getAll();
		File app = new File("/storage/sdcard0/app1");
		File pp = new File(FileSystem.appsDir+"/mfont.ttf");
		Icon ic = new Icon(4);
		Application ap = new Application(ic, "Abummoja", "wintel", "a.n", "v_max");
		Application vap = new Application();
		tb = new TittleBar("Demo app", ap);
		tb.create();
		Installer.install(ap, pp);
		Installer.install(vap, app);
		for(String str : apps){
			System.out.println(str);
		}
		ListView lst = new ListView("~ ", apps);
		lst.show();
		lst.list();
		ListView.list();
		ListView.show();
		Winlogs.log(apps.toString());
		Calendar cal = Calendar.getInstance();
		int h = cal.get(Calendar.HOUR);
		System.out.println(h);
		String[] main = SystemWin.features();
		ListView ls = new ListView(main);
		ls.show();
		TextInput ti = new TextInput();
		String sinp = ti.scan();
		ti.show();
		System.out.println("\u0040");
	}
}
