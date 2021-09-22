package assignment15Collection_List;

import java.util.LinkedList;

public class Q30DisPosAndEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add(15);
		l.add(45);
		l.add(23);
		l.add(78);
		l.add(88);
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println("=index is="+i+"=Element is="+l.get(i));
		}

	}

}
