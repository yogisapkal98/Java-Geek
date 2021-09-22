package assignment_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Q13TSFromHS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();

		hs.add(45);
		hs.add(46);
		hs.add(47);
		hs.add(48);
		hs.add(49);
		
		TreeSet ts=new TreeSet(hs);
		
		System.out.println(ts);

	}

}
