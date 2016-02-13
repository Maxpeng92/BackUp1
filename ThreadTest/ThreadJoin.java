package ThreadTest;

class JoinTest implements Runnable
{
	public void run()
	{
		String str = new String();
		int i = 0;
		for (int j=0;j<20;j++)
		{
			System.out.println(Thread.currentThread().getName()+"---->"+i++);
		}
	}
}
public class ThreadJoin {

	public static void main(String[] args) {
		JoinTest t = new JoinTest();
		Thread pp = new Thread(t);
		pp.setName("my worker thread");
		pp.start();
		int i = 0;
		for (int k=0;k<20;k++)
		{
			if (i == 5)
			{
				try 
				{
					pp.sleep(100);
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			System.out.println("Main Thread: "+i++);
		}

	}

}
