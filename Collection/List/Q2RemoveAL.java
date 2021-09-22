package assignment15Collection_List;

import java.util.ArrayList;
import java.util.List;

public class Q2RemoveAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l=new ArrayList();
		
		l.add(12);
		l.add(19);
		l.add(36);
		l.add(55);
		l.add(30);
		
		System.out.println("Array is ");
		for(int i=0;i<l.size();i++)
		{
		System.out.println(l.get(i));
		
		
		}
		l.remove(3);
		System.out.println("After removing element");
		for(int i=0;i<l.size();i++)
		System.out.println(l.get(i)+"==");
	}

}
