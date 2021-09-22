package assignment4Oops;
import java.util.*;
public class Q1temprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice--1.Fah  2.cel");
		int tem=sc.nextInt();
		
		switch(tem)
		{
		case 1:
			System.out.println("Enter Fahrenheit temp");
			f=sc.nextDouble();
			c=(f-32)*5/9;
			System.out.println("Celsius temp is="+c);
			break;
			
		case 2:
			System.out.println("Enter Celsius temp");
			c=sc.nextDouble();
			f=((9*c)/5)+32;
			System.out.println("Fahrenheit temp is="+f);
			break;
			
		default:
			System.out.println("Invalid choice");
			
			
		}
		
	}

}
