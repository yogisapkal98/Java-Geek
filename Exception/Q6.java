package assignment12ExceptionHandling;

public class Q6 {
	//WAP to check what happen when Exception is thrown by main method

	void m1()
	{
		int a=10;int b=0;
		try
		{
			if(b==0)
			{
				
				System.out.println(a+b);
				System.out.println(" "+a/b);
			}
		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		finally
		{
			System.out.println("final block");
		}
	}
	
	
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Q6 EXP =new Q6();
	EXP.m1();
// if you write Exption on main method the jvm will be handle your expction
	}

}
