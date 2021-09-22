package assignment15Collection_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4ElementPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Ënter No to search" );
		int no=sc.nextInt();
		List l=new ArrayList();

		l.add(12);
		l.add(65);
		l.add(87);
		l.add(30);
		l.add(20);
		
		System.out.println(l.contains(no));
		//System.out.println("Elements of array"+l.get(i));
	
	}

}
