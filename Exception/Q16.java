package assignment12ExceptionHandling;

import java.util.Scanner;

public class Q16 {

	//Create a menu driven program 1. Try Catch demo 2.Try Multi 
	//Catch 3.Try Finally 4.Try Catch Finally 5. Throw 6.Throws
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		Scanner scan=new Scanner(System.in);
		do
		{
			System.out.println("enter your choice");
			System.out.println("1 :try catch demo addition");
			System.out.println("2: try multi catch subtraction ");
			System.out.println("3 :try finally division ");
			System.out.println("4: try catch finally");
			System.out.println("5: throw :");
			System.out.println("6 :throws: ");
			ch=scan.nextInt();
			
			switch(ch)
			{
			case 1:
			{
				try
				{
					int a=10;int b=0;
					int c=a+b;
					System.out.println("addition is: "+c);
				}
				catch(Exception e)
				{
					System.out.println("addititon ");
					e.printStackTrace();
				}break;
			}
			case 2:
			{
				try 
				{
					int a=10;int b=0;
					System.out.println(a-b);

				}
				catch(ArithmeticException e)
				{
					System.out.println("ArithmeticException ");
					e.printStackTrace();
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("ArrayIndexOutOfBoundsException throw");
				}
				catch(RuntimeException e)
				{
					System.out.println("RuntimeException show : ");
					e.printStackTrace();
				}
				catch(Exception e)
				{
					System.out.println("Exception thorw: ");
					e.printStackTrace();
				}break;
			}
			case 3 :
			{
				try
				{
					int a=10;int b=0;
					System.out.println(a/b);
				}
				finally
				{
					System.out.println("finally block will be excute");
				}
				break;
			}
			case 4:
			{
				try 
				{
					int a=10;int b=0;
					System.out.println(a-b);

				}
				catch(ArithmeticException e)
				{
					System.out.println("ArithmeticException ");
					e.printStackTrace();
				}
				finally
				{
					System.out.println("finally block will be executeted");
				}break;
			}
			case 5:
			{
				try
				{
					int a=20;int b=0;
					System.out.println(a/b);
					throw new ArithmeticException();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			}
			case 6:
			{
				try
				{
					int a=10;int b=0;
					if(b==0)throw new Exception();
					{
						System.out.println(a/b);
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
					System.out.println("throws exceptions");
				}break;
			}
			}


		}while(ch!=7);

	}
}
