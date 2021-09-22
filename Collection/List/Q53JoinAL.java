package assignment15Collection_List;

import java.util.ArrayList;

public class Q53JoinAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();

		l.add(45);
		l.add(44);
		l.add(43);
		l.add(42);
		l.add(41);
		
		ArrayList l2=new ArrayList();

		l2.add(55);
		l2.add(54);
		l2.add(53);
		l2.add(52);
		l2.add(51);
		
		l2.addAll(l);
		System.out.println(l2);

	}

}
