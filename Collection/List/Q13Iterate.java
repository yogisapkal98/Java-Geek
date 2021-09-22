package assignment15Collection_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Q13Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l=new LinkedList();

		l.add(12);
		l.add(45);
		l.add(78);
		l.add(79);
		l.add(14);
		
		ListIterator itr=l.listIterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}

	}

}
