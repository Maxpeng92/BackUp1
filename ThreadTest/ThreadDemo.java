package ThreadTest;

public class ThreadDemo {

	public static void main(String[] args) 
	{
		new TestThread().start();
		new TestThread().start();
		new TestThread().start();
		new TestThread().start();
	}

}

class TestThread extends Thread
{

		private int tickets = 20;
		public void run()
		{
			while (true)
			{
				if(tickets>0)
					System.out.println(Thread.currentThread().getName()+" sell tickets "+tickets--);
			}
		}
}