package arraylistdemo.java.a;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(new Integer(10000-2000), "san");
		tm.put(new Integer(10000-1500), "si");
		tm.put(new Integer(10000-2500), "wu");
		tm.put(new Integer(10000-5000), "liu");
		
		Collection col = tm.values();
		Iterator i = col.iterator();
		System.out.println("high to low order: ");
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
