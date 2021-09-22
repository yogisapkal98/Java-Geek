package assignment15Collection_List;

import java.util.ArrayList;
import java.util.List;

public class Q6InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l=new ArrayList();
		
		l.add(12);
		l.add(45);
		l.add(78);
		l.add(79);
		l.add(12);
		
		l.add(0, 33);
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}

	}

}
