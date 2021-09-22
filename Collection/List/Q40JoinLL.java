package assignment15Collection_List;

import java.util.LinkedList;

public class Q40JoinLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l1=new LinkedList();

		l1.add(45);
		l1.add(44);
		l1.add(43);
		l1.add(42);
		l1.add(41);

		System.out.println(l1);
		LinkedList l2=new LinkedList();

		l2.add(55);
		l2.add(54);
		l2.add(53);
		l2.add(52);
		l2.add(51);
		System.out.println(l2);
		
		
		l2.addAll(l1);
		System.out.println(l2);

	}

}
