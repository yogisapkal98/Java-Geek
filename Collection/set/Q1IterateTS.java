package assignment_Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Q1IterateTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s=new TreeSet();
		
		s.add(12);
		s.add(5);
		s.add(8);
		s.add(89);
		s.add(55);
		s.add(16);
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}

	}

}
