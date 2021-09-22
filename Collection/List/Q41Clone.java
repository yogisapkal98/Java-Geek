package assignment15Collection_List;

import java.util.Iterator;
import java.util.LinkedList;

public class Q41Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();

		l1.add(45);
		l1.add(44);
		l1.add(43);
		l1.add(42);
		l1.add(41);
		
		Object o=l1.clone();
		System.out.println(o);
		
		LinkedList l2=new LinkedList();
		
		l2=(LinkedList) l1.clone();
		System.out.println(l2);

	}

}
