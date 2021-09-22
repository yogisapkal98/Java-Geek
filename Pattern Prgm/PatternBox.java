package basic.program;

import java.util.Scanner;

public class PatternBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row");
		int r=sc.nextInt();
		System.out.println("Enter column");
		int c=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if((i==1) || (i==r) || (j==1) || (j==c))
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
