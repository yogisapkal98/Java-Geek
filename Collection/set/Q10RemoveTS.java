package assignment_Set;

import java.util.TreeSet;

public class Q10RemoveTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();

		ts.add(15);
		ts.add(14);
		ts.add(13);
		ts.add(12);
		ts.add(11);
		
		System.out.println(ts);
		
		ts.remove(13);
		System.out.println(ts);

	}

}
