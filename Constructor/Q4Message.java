package assignment6Constructor;

import java.util.Scanner;

public class Q4Message {
	
	String a;
	

	public Q4Message() {	
		super();
		System.out.println("I love Programming Language");
	}
	

	public Q4Message(String a) {
		super();
		this.a = a;
		System.out.println("I love "+a);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q4Message m1=new Q4Message();
		System.out.println("========================");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String a=sc.next();
		Q4Message m2=new Q4Message(a);

	}

}
