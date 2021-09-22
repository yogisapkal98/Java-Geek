package assignment15Collection_List;

import java.util.ArrayList;
import java.util.Collections;

public class Q51RetainAllAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();

		l.add(45);
		l.add(44);
		l.add(43);
		l.add(42);
		l.add(41);
		

		
		System.out.println(l);
		l.retainAll(l);
		System.out.println(l);


	}

}
