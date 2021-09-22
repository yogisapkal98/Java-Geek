package assignment_Set;

import java.util.HashSet;
import java.util.Iterator;

public class Q5IterateHSandObserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		
		hs.add(45);
		hs.add(46);
		hs.add(47);
		hs.add(48);
		hs.add(49);
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}

	}

}
