package arraylistdemo.java.a;

import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("Max Peng", 6868.68);
		hm.put("John Doe", 3134.54);
		hm.put("Tod Hall", 1945.43);
		hm.put("Jane Meng", -134.54);
		Set s = hm.entrySet();
		Iterator i = s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey()+": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		double balance = ((Double) hm.get("John Doe")).doubleValue();
		hm.put("John Doe", new Double(balance+1000));
		System.out.println("John's money: "+hm.get("John Doe"));
	}

}
