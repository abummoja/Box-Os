
import windroid.files.*;
import java.io.File;

import box.ui.Print;

public class Home
{
	
	public static void main(String[] args){
		FileSystem.startFs();
		//load app list & show date time
		File appList = new File(FileSystem.appsDir+"/app-list.lst");
		//App list should not be null.
		if(!appList.exists())
			//log error Logger.log(msg)
			Print.staticOut("app-list not found");
			return;
		//read app list(json)
	}
	public void run() {
		main(null);
	}
}
