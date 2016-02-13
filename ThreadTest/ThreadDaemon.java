package ThreadTest;

public class ThreadDaemon {

	public static void main(String[] args) {
		DaemonTest t = new DaemonTest();
		Thread tt = new Thread(t);
		tt.setDaemon(true);
		tt.start();
	}

}

class DaemonTest implements Runnable
{
	public void run()
	{
		while(true)
		{
			System.out.println(Thread.currentThread().getName()+"is running...");
		}
	}
}