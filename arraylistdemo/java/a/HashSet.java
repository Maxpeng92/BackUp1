package arraylistdemo.java.a;

import java.util.*;
public class HashSet {

	public static void main(String[] args) {
		ArrayList<String> hs = new ArrayList<String>();
	    hs.add("B");
	    hs.add("A");
	    hs.add("D");
	    hs.add("E");
	    hs.add("C");
	    hs.add("F");
	    
	    Iterator<String> itr = hs.iterator();
	    while(itr.hasNext())
	    {
	    	Object element = itr.next();
	    	System.out.print(element+" ");
	    }
	    System.out.println();
	    ListIterator<String> litr = hs.listIterator();
	    while(litr.hasNext())
	    {
	    	Object element = litr.next();
	    	litr.set(element+"+");
	    }
	    itr = hs.iterator();
	    while(itr.hasNext())
	    {
	    	Object element = itr.next();
	    	System.out.print(element+" ");
	    }
	    System.out.println();
	    while(litr.hasPrevious())
	    {
	    	Object element = litr.previous();
	    	System.out.print(element+" ");
	    }
	    System.out.println();
	}
}

