package basic.program;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		int b=18;
		int c=25;
		
		if(a>b && a>c)
		{
			System.out.println("*a is greater*");
		}
		else
		{
			if(b>c)
			{
				System.out.println("*bis greater*");
			}
			else
			{
				System.out.println("*c is greater");
			}
		}
	}

}
