package assignment15Collection_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Q15ReplSpecifiedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l=new LinkedList();

		l.add(12);
		l.add(45);
		l.add(78);
		l.add(79);
		l.add(14);
		
		
		l.set(2, 888);
		//System.out.println(l);
		Iterator itr=l.iterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}

	}

}
