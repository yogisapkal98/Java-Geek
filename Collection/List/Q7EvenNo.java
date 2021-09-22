package assignment15Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q7EvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();

		for(int i=0;i<=50;i++)
		{
			l.add(i);
		}
		Iterator itr=l.iterator();

		for(int j=0;j<l.size();j++)
		{

			while(itr.hasNext())
			{
				Object o=itr.next();
				int e=(int)o;

				if(e%2==0)
				{
					System.out.println(e);
				}
			}



		}

	}
}