package demo.java.b;
import demo.java.a.*;

public class Student extends Person
{
	public Student(String name)
	{
		this.name = name;
	}
	public String talk()
	{
		return "Person ----> talk "+this.name;
	}
}
