package assignment12ExceptionHandling;

public class Q5AIndexOutBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={12,3,5,8,5,9,56,8};
		
		try
		{
			System.out.println(a[67]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Exception");
			e.printStackTrace();
		}
		System.out.println("Exception handled");

	}

}
