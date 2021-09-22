package assignment4Oops;
import java.util.*;
public class Q2ClassEmp {
	
	public static void main(String args[])
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Salary");
	int sal=sc.nextInt();
	int bonus,total;
	System.out.println("Enter experience");
	int exp=sc.nextInt();
	
	if(exp>=3)
	{
		bonus=(sal*20)/100;
		System.out.println("Bonus is="+bonus);
		total=bonus+sal;
		System.out.println("Toal Salary is="+total);
	}
	else
	{
		System.out.println("Youre Expreience is not Above 3 yr so salary is="+sal);
	}

}
}