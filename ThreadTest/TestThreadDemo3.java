package ThreadTest;

public class TestThreadDemo3 {

	public static void main(String[] args) 
	{
		TestThread3 t = new TestThread3();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}

}

class TestThread3 implements Runnable
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