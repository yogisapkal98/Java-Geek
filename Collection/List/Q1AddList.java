package assignment15Collection_List;

import java.util.ArrayList;
import java.util.List;

public class Q1AddList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l=new ArrayList();
		l.add(46);
		l.add(23);
		l.add(98);
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}

	}

}
