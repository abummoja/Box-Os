import java.io.*;
import java.util.*;
import java.lang.reflect.*;

public class MakeToday {
	Date today = new Date();
	String todayMillis = Long.toString(today.getTime());
	String todayClass = "z_" + todayMillis;
	String todaySource = todayClass + ".java";

	public static void main (String args[]){
		MakeToday mtc = new MakeToday();
		mtc.createIt();
		if (mtc.compileIt()) {
			System.out.println("Running " + mtc.todayClass + ":\n\n");
			mtc.runIt();
		}
		else {
			System.out.println(mtc.todaySource + " is bad.");
		}
	}

	public void createIt() {
		try {
			FileWriter aWriter = new FileWriter(todaySource, true);
			aWriter.write("public class "+ todayClass + "{");
			aWriter.write(" public void doit() {");
			aWriter.write(" System.out.println(\""+todayMillis+"\");");
			aWriter.write(" }}\n");
			aWriter.flush();
			aWriter.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public boolean compileIt() {
		String [] source = { new String(todaySource)};
		ByteArrayOutputStream baos= new ByteArrayOutputStream();

		new sun.tools.javac.Main(baos,source[0]).compile(source);
		// if using JDK >= 1.3 then use
		//   public static int com.sun.tools.javac.Main.compile(source);    
		return (baos.toString().indexOf("error")==-1);
	}

	public void runIt() {
		try {
			Class params[] = {};
			Object paramsObj[] = {};
			Class thisClass = Class.forName(todayClass);
			Object iClass = thisClass.newInstance();
			Method thisMethod = thisClass.getDeclaredMethod("doit", params);
			thisMethod.invoke(iClass, paramsObj);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
