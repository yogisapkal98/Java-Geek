package assignment15Collection_List;

import java.util.ArrayList;
import java.util.List;

public class Q9Isempty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();

		l.add(12);
		l.add(45);
		l.add(78);
		l.add(79);
		l.add(12);
		
		boolean e=l.isEmpty();
		if(e==true)
		{
			System.out.println("List is Empty");
		}
		else
		{
			System.out.println("List is Not Empty");
		}


	}

}
