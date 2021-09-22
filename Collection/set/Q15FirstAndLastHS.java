package assignment_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Q15FirstAndLastHS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hs=new LinkedHashSet();

		hs.add(45);
		hs.add(46);
		hs.add(47);
		hs.add(48);
		hs.add(49);
		
		LinkedList l=new LinkedList(hs);
		
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());

	}

}
