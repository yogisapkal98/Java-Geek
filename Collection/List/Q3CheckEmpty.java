package assignment15Collection_List;

import java.util.ArrayList;
import java.util.List;

public class Q3CheckEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l=new ArrayList();
		
		l.add(15);
		l.add(78);
		l.add(89);
		l.add(66);
		
		
		if(l.isEmpty())
		{
			System.out.println("Array list is Empty");
		}
		else
		{
			System.out.println("Array is Not empty");
		}

	}

}
