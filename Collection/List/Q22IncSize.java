package assignment15Collection_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q22IncSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l2=new ArrayList();
		l2.add(12);
		l2.add(45);
		l2.add(10);
		l2.add(78);
		
		System.out.println(l2);
		l2.ensureCapacity(8);
		System.out.println(l2);

	}

}
