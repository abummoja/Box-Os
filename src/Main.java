import java.util.*;

import box.ui.Print;
import box.ui.TextInput;
import windroid.files.*;
import java.io.File;

public class Main implements Print
{
	public static void main(String[] args)
	{
		//check if system files& dirs exist, if not create them.
		FileSystem.startFs();
		//start necessary services & apps (startup apps)
		//load login page if needed else load home page (list apps)
		String passPath = FileSystem.winRoot.getPath()+"/pass.key";
		File pf = new File(passPath);
		if(pf.exists()) {
			TextInput passKeyIn = new TextInput("Enter Password:", "password");
			String enteredPass = passKeyIn.inputStr;//if it matches the hashed stored value
		}else {
			//Print.staticOut("Press Enter To Continue...");
			//show desktop
			Home mHome = new Home();
			mHome.run();
		}
	}
}
