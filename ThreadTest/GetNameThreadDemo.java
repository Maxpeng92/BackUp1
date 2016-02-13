package ThreadTest;

public class GetNameThreadDemo extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			printMsg();
		}
	}
	public void printMsg()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name: "+name);
	}
	

	public static void main(String[] args) {
		GetNameThreadDemo t1 = new GetNameThreadDemo();
		t1.setName("Test Thread");
		System.out.println("before start(), is t alive? "+t1.isAlive());
		t1.start();
		for (int j=0;j<10;j++)
		{
			t1.printMsg();
		}
	}

}
