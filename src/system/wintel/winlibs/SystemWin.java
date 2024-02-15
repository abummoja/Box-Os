package system.wintel.winlibs;

import java.io.*;
import windroid.files.*;

public class SystemWin
{
	static String[] feats = {"Widgets", "Views", "System", "Utils", "Version"};
	public static String name = "WinDroid";
	
	public static File getRoot(){
		return FileSystem.rootDir;
	}
	public static File getCache(){
		return FileSystem.cacheDir;
	}
	public static String getName(){
		return name;
	}
	public static String[] features(){
		return feats;
	}
}
