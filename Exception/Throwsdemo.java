package assignment12ExceptionHandling;

import java.util.Scanner;

class Demo
{
	int m1(int divident,int divisior) 
	{
		if(divisior==0)
			throw new ArithmeticException("divisior can not be zero");
		int result=divident/divisior;
		return result;
	}
}
public class Throwsdemo {

	//	Create a class, Demo with a method, division with two int parameters
	//a. Dividend b. Divisor
	//This method should divide the dividend by divisor and return the result

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo =new Demo();
		int result = 0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int dividant=scan.nextInt();
		System.out.println("enter  second number");
		int divisior=scan.nextInt();
		try
		{
			result=demo.m1(dividant, divisior);
				System.out.println("result: "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmatic exception throw:");

			e.printStackTrace();
		}
		finally
		{
			System.out.println(" finally the result is :"+result);
			scan.close();
		}
	
	}
}
