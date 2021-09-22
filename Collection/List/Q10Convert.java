package assignment15Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Q10Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l=new ArrayList();

		l.add(12);
		l.add(45);
		l.add(78);
		l.add(79);
		l.add(12);
		
		List ll=new LinkedList(l);
		Iterator itr=ll.iterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}


	}

}
