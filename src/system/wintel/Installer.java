package system.wintel;

import java.io.*;
import windroid.files.*;
import Application;

public class Installer
{
	public Installer()
	{
		// empty
	}
	public static void install(Application ap, File dest)
	{
		String fPath = dest.getAbsolutePath();
		File app = new File(fPath);
		if (fPath == FileSystem.appsDir.toString()+"/"+dest.getName().toString())
		{
			System.out.println("Cant install from" + fPath);
		}
		else
		{
				boolean n = FileSystem.addPkg(app);
				if (n)
				{
					System.out.println("Install complete");
					System.out.println("\n");
					ap.getIcon().show();
					System.out.print(ap.getName() + "\n");
				}
				else
				{
					System.out.println("Installation failed");
				}
			
		}
	}
	public static String[] getAll()
	{
		File all = FileSystem.appsDir;
		String[] lst = all.list();
		return lst;
	}
}
