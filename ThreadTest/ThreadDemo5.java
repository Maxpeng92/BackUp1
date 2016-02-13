package ThreadTest;

public class ThreadDemo5 {

	public static void main(String[] args) {
		SynTest t = new SynTest();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
}

class SynTest implements Runnable
{
	private int tickets = 20;
	public synchronized void run()
	{
		while(true)
		{
			if (tickets > 0)
			{
				try
				{
					Thread.sleep(100);
				}
				catch (Exception e)
				{}
				System.out.println(Thread.currentThread().getName()+"Tickets: "+tickets--);
			}
		}
	}
		
}


