package arraylistdemo.java.a;

import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<Integer>();
		System.out.println(al.size());
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1,7);
		al.addLast(100);
		al.addFirst(9);
		System.out.println(al.size());
		System.out.println("Content of al: "+al);
		
		al.remove(3);
		al.removeFirst();
		al.removeLast();
		System.out.println(al);
		System.out.println(al.get(1));
		
		Object ia[] = al.toArray();
		int sum = 0;
		
		for (int i=0;i<ia.length;i++)
		{
			sum += ((Integer) ia[i]).intValue();
		}
		System.out.println(sum);
	}

}
