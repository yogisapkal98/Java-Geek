package assignment12ExceptionHandling;

public class Q2TryandFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=12;
		int b=0;
		
		
		try
		{
			System.out.println(a/b);
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("Exception handled");
	}

}
