package demo.java.a;

public class TestException3 {

	public static void main(String[] args) {
		
		int a = 4, b = 0;
		try
		{
			if (b == 0)
			{
				throw new ArithmeticException("Arithmetic Exception Error!");
			}
			else 
			{
				System.out.println(a+" / "+b+" = "+a/b);
			}
		}
		catch (ArithmeticException e)
		{
			System.out.println("Error: "+e);
		}
	}

}
