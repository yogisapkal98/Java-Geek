package assignment12ExceptionHandling;

public class Q3tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=0;
		
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("Exception handeld");

	}

}
