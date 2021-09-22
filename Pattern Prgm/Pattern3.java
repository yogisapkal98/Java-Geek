package basic.program;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("@");
				}
				
			}
			System.out.println( );
		}
	}

}
