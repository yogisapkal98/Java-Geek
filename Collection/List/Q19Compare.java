package assignment15Collection_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q19Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add(12);
		l.add(45);
		l.add(15);
		l.add(78);
		
		List l2=new ArrayList();
		l2.add(12);
		l2.add(45);
		l2.add(10);
		l2.add(78);
		
		Boolean m=l.containsAll(l2);
		
		if(m)
		{
			System.out.println("Elements are same");
		}
		else
		{
			System.out.println("Not equal");
		}
		

	}

}
