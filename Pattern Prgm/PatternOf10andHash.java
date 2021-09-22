package basic.program;

public class PatternOf10andHash {
	/*
10###
100##
1000#
10000
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1)
				{
					System.out.print("1");
				}
				else if(j==2 || j<=i+1)
				{
					System.out.print("0");
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
