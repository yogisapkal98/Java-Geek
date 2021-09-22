package assignment15Collection_List;

import java.util.ArrayList;
import java.util.List;

public class Q18CopyToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l=new ArrayList();
		l.add(12);
		l.add(45);
		l.add(15);
		l.add(78);
		l.add(49);
		
		List l2=new ArrayList(l);
		System.out.println(l2);

	}

}
