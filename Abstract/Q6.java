package assignment9Abstract;

import java.util.Scanner;

interface LibraryUser
{
	void registerAccount();
	void requestBook();
}


class Kidsuser implements LibraryUser
{
	@Override
	public void registerAccount(){

		Scanner scan=new Scanner(System.in);
	    System.out.println("enter the age for kid user");
	    int age=scan.nextInt();
		if(age<12)
		{
			System.out.println("You have successfully registered under a Kids account");
		}
		else
		{
			System.out.println("“Sorry, Age must be less than 12 to register as a kid");
		}
		
	}

	@Override
	public void requestBook() {
		
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter the book name");
	    String book=scan.next();
	    if(book!="kids")
	    {
	    	System.out.println("Book Issued successfully, please returnthe book within 10 days");
	    }
	    else
	    {
	    	System.out.println("Oops, you are allowed to take only kids books");
	    }
	    
	   
	}
	
}
class AdultUser implements LibraryUser
{

	@Override
	public void registerAccount() {
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter the age for adult user");
	    int age=scan.nextInt();
	    if(age>12)
	    {
	    	System.out.println("You have successfully registered under anAdult Account");
	    }
	    else
	    {
	    	System.out.println("“Sorry, Age must be greater than 12 to register as an adult");
	    }
		
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter the book name");
	    String book=scan.next();
	    if(book!="fiction")
	    {
	    	System.out.println("Book Issued successfully, please returnthe book within 7 days");
	    }
	    else
	    {
	    	System.out.println("Oops, you are allowed to take only adult Fiction books");
	    }
	}
	
}



public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kidsuser kid=new Kidsuser();
		kid.registerAccount();
		kid.requestBook();
		
		AdultUser adult=new AdultUser();
		adult.registerAccount();
		adult.requestBook();
	}

}
