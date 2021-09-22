package basic.program;

public class Patternfor3
{
	public static void main(String args[]){
		
	for(int j=0;j<5;j++)
	{
		for(int i=0;i<5;i++)
		{
			if(i==0 || i==4)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println( );
	}

}

}

