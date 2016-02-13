package javaProject2;

public class RunTimeDemo {

	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		try
		{
			run.exec("notepad.exe");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
