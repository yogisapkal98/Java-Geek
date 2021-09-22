package assignment15Collection_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Q56MethodArray {
	int sum=0;
	void Add(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q56MethodArray e=new Q56MethodArray();
		
		int a[]={12,10,15,8};
		e.Add(a);

		
		
		/*int i=0;
		ArrayList<Integer> l=new ArrayList<Integer>();
		
		l.add(12);
		l.add(45);
		l.add(7);
		l.add(48);
		l.add(89);
		l.add(23);
		
		System.out.println(l);
		
		int add=10;
	
		for(i=0;i<l.size();i++);
		{
			add=add+l.get(i);
			System.out.println(add);
		}
		*/
	}

}
