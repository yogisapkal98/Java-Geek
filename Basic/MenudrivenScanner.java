package basic.program;
import java.util.*;
public class MenudrivenScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Choice");
		Integer i=scan.nextInt();
		System.out.println("Enter Loop");
		Integer n=scan.nextInt();
		Integer m=scan.nextInt();
		
		switch(i)
		{
		case 1:
		{
			for(int k=1;k<=n;k++)
			{
				for(int j=n;j>i;j--)
				{
					System.out.print(" ");
				}
				System.out.println();
				for(int l=1;l<=k;l++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		
		break;
		}
		case  2:
		{
		for(int a=1;a<=n;a++)
		{
			for(int b=1;b<=n;b++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		break;
		}
		case 3:
		{
			for(int e=1;e<=m;e++)
			{
				for(int t=1;t<=n;t++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
			}
			break;
		}
		default:
		{
			System.out.println("Invalid choice");
			break;
		}
		}
		
	}

}
