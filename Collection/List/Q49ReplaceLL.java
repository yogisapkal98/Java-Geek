package assignment15Collection_List;

import java.util.LinkedList;

public class Q49ReplaceLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l1=new LinkedList();

		l1.add(45);
		l1.add(44);
		l1.add(43);
		l1.add(42);
		l1.add(41);
		
		System.out.println(l1);
		
		l1.set(2, 555);
		System.out.println(l1);

	}

}
