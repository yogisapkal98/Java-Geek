package assignment15Collection_List;

import java.util.ArrayList;
import java.util.List;

public class Q21TrimArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList l2=new ArrayList();
		l2.add(12);
		l2.add(45);
		l2.add(10);
		l2.add(78);

		l2.trimToSize();
		System.out.println(l2);
	}

}
