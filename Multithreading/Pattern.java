package multithreading.prac;

public class Pattern {

	synchronized void displayP(char c)
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}

	void method2(String s)
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(s);
			}
			System.out.println();
		}
	}

	synchronized void method3(char d)
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(d);
			}
			System.out.println();
		}

	}
}

