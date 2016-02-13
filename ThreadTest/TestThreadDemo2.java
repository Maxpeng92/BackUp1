package ThreadTest;

public class TestThreadDemo2 {

	public static void main(String[] args) {
		TestThread2 t= new TestThread2();
		new Thread(t).start();
		for (int i=0;i<10;i++)
			System.out.println("Main Thread is running..."+i);
	}

}

class TestThread2 implements Runnable
{
	public void run()
	{
		for (int j=0;j<10;j++)
			System.out.println("TestThread is running..."+j);
	}
}
