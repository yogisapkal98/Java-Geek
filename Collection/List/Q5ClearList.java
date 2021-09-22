package assignment15Collection_List;

import java.util.ArrayList;
import java.util.List;

public class Q5ClearList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l=new ArrayList();
		
		l.add(12);
		l.add(10);
		l.add(22);
		l.add(442);
		
		
		
		l.clear();
		
		for(int i=0;i<l.size();i++)
		{
		System.out.println(l.get(i));
		}
	}

}
