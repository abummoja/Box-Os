package box.ui;

public interface Print {
	public default void out(String output) {
		System.out.print(output);
		//todo: add logger > if(printSuccess)...else(fail)Logger.log();
	}
	public static void staticOut(String output) {
		System.out.print(output);
	}
}
