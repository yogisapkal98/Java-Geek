package assignment_Queue;

import java.util.ArrayDeque;

public class Q4RemoveNonExistingEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque q=new ArrayDeque();

		q.add(12);
		q.add(8);
		q.add(88);
		q.add(2);
		q.add(23);
		q.add(12);

		System.out.println(q);

		q.remove(2);
		System.out.println(q);
	}

}
