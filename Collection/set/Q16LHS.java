package assignment_Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Q16LHS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lh=new LinkedHashSet();
		
		lh.add(15);
		lh.add(45);
		lh.add(95);
		lh.add(85);
		lh.add(75);
		
		Iterator itr=lh.iterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}
		

	}

}
