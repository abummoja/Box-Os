package box.system.apps;
import box.ui.*;
import box.Application;

public class TestApplication extends Application implements Print
{
	String name = "TestApp";
	public TestApplication(String name, String developer, String manifest, boolean isRunning) {
		super(name, developer, manifest, isRunning);
		// TODO Auto-generated constructor stub
	}
	static ListView lst;
	@Override
	public void startApp() {
		// TODO Auto-generated method stub
		TestApplication ta = new TestApplication(name, "Abraham@box-os.dev", null, true);
		ta.main(null);
		out("Running");
		super.startApp();
	}
	@Override
	public void stopApp() {
		// TODO Auto-generated method stub
		super.stopApp();
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	static String[] array;
	public static void main(String[] args){
		String[] array = {"One", "Two", "three"};
		lst = new ListView(array);
		//normal list
		lst.show();
		//numbered list
		lst.showWithNumbers();
		// dividers in list
		lst.showWithDividers();
	}
}
