package basic.program;

public class Patternfor5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j=0;j<5;j++)
		{
			for(int i=0;i<5;i++)
			{
				if((i==0 || i==4)||(j==0 || j==4))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	}
