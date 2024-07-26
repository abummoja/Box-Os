package windroid.files;

import java.io.*;

public class FileSystem
{
	public static File rootDir = new File("/storage/sdcard0/os/WinDroid");
	public static File winRoot = new File("/storage/sdcard0/os/WinRoot");
	public static File cacheDir = new File("/storage/sdcard0/os/WinDroid/caches");
	public static File dataDir = new File("/storage/sdcard0/os/WinDroid/data");
	public static File filesDir = new File("/storage/sdcard0/os/WinDroid/files/Memory");
	public static File appsDir = new File("/storage/sdcard0/os/WinDroid/files/Memory/_inst");
	public static void startFs()
	{
		checkFs(rootDir);
		checkFs(winRoot);
		checkFs(cacheDir);
		checkFs(dataDir);
		checkFs(filesDir);
		checkFs(appsDir);
	}
	public static void checkFs(File fl)
	{

		if (!fl.exists())
		{
			boolean nool = fl.mkdir();
			if (nool)
			{
				System.out.println("__new_file_in:-"+fl.getAbsolutePath().toString()+"\n");
			}
			else
			{
				fl.mkdirs();
			}
		}
		else if (fl.exists())
		{
			System.out.print("_fs.exists__winFs-");
		}
	}
	public static void printName()
	{
		System.out.println("winFs");
	}
	public static void createFile(String name)
	{
		String mmc = filesDir.getAbsolutePath().toString() + "/" + name;
		File fl = new File(mmc);
		try
		{
			fl.createNewFile();
		}
		catch (Exception e)
		{
			fl.mkdirs();
			System.out.println("Fs > exception");
		}
	}
	public static boolean addPkg(File pkg)
	{
		String ppath = pkg.getAbsolutePath().toString();
		File dest = new File(ppath);
		String pn = pkg.getName().toString();
		String app = appsDir.getAbsolutePath().toString() + "/" + pn;
		File napk = new File(app);
		boolean inst = dest.renameTo(napk);
		if (inst)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}
