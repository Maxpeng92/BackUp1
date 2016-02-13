package demo.java.a;

class DefaultException extends Exception
{
	public DefaultException (String msg)
	{
		super(msg);
	}
}
public class TestException6 {

	public static void main(String[] args) {
		try
		{
			throw new DefaultException ("Definition Error!");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
