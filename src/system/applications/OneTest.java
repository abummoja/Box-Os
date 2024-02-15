package system.applications;
import windroid.files.*;
import system.wintel.winlibs.*;
import java.io.*;

public class OneTest
{
	public static void main(String[] args){
		FileSystem.startFs();
		FileSystem.printName();
		FileSystem.createFile("One test Dir");
		FileSystem.createFile("Test file");
	}
}
