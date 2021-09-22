package assignment12ExceptionHandling;

public class Q4EmptyCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=12;
		int b=0;
		
		try
		{
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Exception handled");

	}

}
