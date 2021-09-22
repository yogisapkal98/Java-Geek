package assignment12ExceptionHandling;

import java.util.Scanner;

public class User_ragistration {
	

	void ragistration(String username,int age,String countryname)
	{
		if(18<=age)
		{
			System.out.println("user valid for voting");
		}
		else
		{
			try
			{
				throw new InvalidAgeException("user is minor");
			}
			catch(InvalidAgeException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("**********************");
		String s="india";
		if(countryname.equalsIgnoreCase(s))
		{
			System.out.println("valid country name");
		}
		else
		{
			try
			{
				System.out.println("invalid country name");
				throw new Invalidcountryexception("invalid country name");
		
			}
			catch(Invalidcountryexception e)
			{
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter user name");
		String username=scan.next();
		
		System.out.println("enter the age");
		int age=scan.nextInt();
		
		System.out.println("enter country name");
		String countryname=scan.next();
	
		
		User_ragistration user=new User_ragistration ();
		user.ragistration(username, age, countryname);
	}

}
