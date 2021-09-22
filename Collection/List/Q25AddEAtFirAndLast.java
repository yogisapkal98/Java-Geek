package assignment15Collection_List;

import java.util.LinkedList;

public class Q25AddEAtFirAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l=new LinkedList();
		l.add(15);
		l.add(45);
		l.add(23);
		l.add(78);
		l.add(88);
		
		System.out.println(l);
		
		l.addFirst(888);
		l.addLast(999);
		
		System.out.println(l);

	}

}
