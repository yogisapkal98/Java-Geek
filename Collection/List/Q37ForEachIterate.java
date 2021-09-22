package assignment15Collection_List;

import java.util.ArrayList;
import java.util.Iterator;

public class Q37ForEachIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		l.add(15);
		l.add(45);
		l.add(23);
		l.add(78);
		l.add(88);

		for(Object object:l)
		{
			System.out.println(object);

		}

	}
}