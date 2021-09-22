package assignment15Collection_List;

import java.util.ArrayList;
import java.util.List;

public class Q8Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l1=new ArrayList();

		l1.add(12);
		l1.add(48);
		l1.add(78);
		l1.add(79);
		l1.add(12);

		List l2=new ArrayList();

		l2.add(12);
		l2.add(48);
		l2.add(78);
		l2.add(79);
		l2.add(12);

		boolean m=l1.equals(l2);

		if(m==true)
		{
			System.out.println("List is Equal");
		}
		else
		{
			System.out.println("List is Not equal");
		}

	}

}
