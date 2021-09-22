package assignment5Methods;

import java.util.Scanner;

public class Q8Message {
	
	void printMessage(String name)
	{
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q8Message m=new Q8Message();
		Scanner sc=new Scanner(System.in);
		System.out.println("**Enter a Message**");
		String name=sc.next();
		m.printMessage(name);

	}

}
