package assignment5Methods;

import java.util.Scanner;

public class Q3Calculator {
	
	double add(double a,double b)
	{
		 double sum=a+b;
		return sum;
	}
	double sub(int a,int b)
	{
		double sub=a-b;
		return sub;
	}
	double mult(int a,int b)
	{
		double mult=a*b;
		return mult;
	}
	double div(int a,int b)
	{
		double div=a/b;
		return div;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q3Calculator c=new Q3Calculator();
		int ch;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Enter your choice");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			double s=c.add(2,3);
			System.out.println("Addition is="+s);
			break;
		case 2:
			double d=c.sub(6, 3);
			System.out.println("Subtraction is="+d);
			break;
		case 3:
			double m=c.mult(3, 8);
			System.out.println("Multiplication is="+m);
			break;
		case 4:
			double f=c.div(80, 4);
			System.out.println("Division is="+f);
			break;
			
			default:
				System.out.println("Invalid choice");
		break;
		}
		}while(ch!=0);
}
}
