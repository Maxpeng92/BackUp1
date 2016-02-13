package comparator.java.a;

import java.util.*;

class MyComp implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		int k;
		String aStr, bStr;
		aStr = (String) o1;
		bStr = (String) o2;
		k = aStr.compareTo(bStr);
		if (k == 0)
		{
		return bStr.compareTo(aStr);
		}
		else 
			return k;
	}
}
public class ComparatorDemo {

	public static void main(String[] args) {
		TreeMap<String,Double> tm = new TreeMap<String,Double>(new MyComp());
		tm.put("Max Peng", 6868.68);
		tm.put("John Doe", 3134.54);
		tm.put("Tod Hall", 1945.43);
		tm.put("Jane Meng", -134.54);
		Set set = tm.entrySet();
		Iterator itr = set.iterator();
	    
	    while (itr.hasNext())
	    {
	    	Map.Entry me = (Map.Entry) itr.next();
	    	System.out.print(me.getKey()+": ");
	    	System.out.println(me.getValue());
	    }
	    System.out.println("******************");
	    double balance = ((Double) tm.get("John Doe")).doubleValue();
	    tm.put("John Doe", new Double(balance+2000));
		System.out.println("John's money: "+tm.get("John Doe"));
	}

}
