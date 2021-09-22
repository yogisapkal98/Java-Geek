package assignment15Collection_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Q55ShuffleLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		
		l.add(45);
		l.add(44);
		l.add(43);
		l.add(42);
		l.add(41);
		
		System.out.println(l);
		
		Collections.shuffle(l);
		System.out.println(l);

	}

}
