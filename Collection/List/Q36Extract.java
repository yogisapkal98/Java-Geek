package assignment15Collection_List;

import java.util.LinkedList;
import java.util.List;

public class Q36Extract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add(15);
		l.add(45);
		l.add(23);
		l.add(78);
		l.add(88);

		l.add(1);
		l.add(22);
		l.add(89);
		l.add(01);
		System.out.println(l);
		
		List l2=(l.subList(3, 6));
		System.out.println(l2);

	}

}
