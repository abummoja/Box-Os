package windroid.utils;

import java.io.*;
import java.util.*;
import windroid.files.*;

public class Winlogs
{
	static File logFile;
	static String logName;
	public Winlogs()
	{
		Calendar c = Calendar.getInstance();
		int dt = c.get(Calendar.DATE);
		this.logName = "winlog";
	}
	public Winlogs(String logName)
	{
		this.logName = logName;
	}
	public static void log(String log)
	{
		logFile = new File(FileSystem.dataDir.toString() + "/" + logName + ".txt");
		try
		{
			Formatter f = new Formatter(logFile.getAbsolutePath().toString());
			f.format("%s", log);
		}
		catch (Exception e)
		{
			try
			{
				Formatter gt = new Formatter(logFile);
				gt.format("%s", log);
				gt.flush();
				gt.close();
			}
			catch (FileNotFoundException ex)
			{
				System.out.println("logging__Failed");
			}
		}
	}
}
