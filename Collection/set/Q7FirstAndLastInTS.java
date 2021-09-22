package assignment_Set;

import java.util.TreeSet;

public class Q7FirstAndLastInTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		
		ts.add(15);
		ts.add(14);
		ts.add(13);
		ts.add(12);
		ts.add(11);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());

	}

}
