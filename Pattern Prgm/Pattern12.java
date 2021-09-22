package basic.program;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=15;j++)
			{
				if(j<=6)
				{
					System.out.print("*");
				}
				else if(j<=11)
				{
					System.out.print("@");
				}
				else
				{
					System.out.print("#");
				}
			}
			System.out.println();
		}

	}

}
