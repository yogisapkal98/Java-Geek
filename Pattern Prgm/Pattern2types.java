package basic.program;

public class Pattern2types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(j);
			}

			if(i>=2)
			{
				for(int k=1;k<i;k++)
				{
					System.out.print(k);
				}
			}
			System.out.println();
		}

	}

}
