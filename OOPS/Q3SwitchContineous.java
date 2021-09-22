package assignment4Oops;
import java.util.*;
public class Q3SwitchContineous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice");
		int n=0;
		
		do{
			
			System.out.println("1.Add");
			System.out.println("2.Sub");
			System.out.println("3.Mult");
			System.out.println("4.Quite");
			int ch=sc.nextInt();
			
			int result=0;
			switch(ch)
			{
			case 1:
				System.out.println("Enter 1st number");
				int a=sc.nextInt();
				System.out.println("Enter 2nd number");
				int b=sc.nextInt();
				result=a+b;
				System.out.println("Addition is="+result);
				break;
				
			case 2:
				System.out.println("Enter 1st number");
				int s=sc.nextInt();
				System.out.println("Enter 2nd number");
				int d=sc.nextInt();
				result=s-d;
				System.out.println("Subtraction is="+result);
				break;
				
			case 3:
				System.out.println("Enter 1st number");
				int g=sc.nextInt();
				System.out.println("Enter 2nd number");
				int h=sc.nextInt();
				result=g*h;
				System.out.println("Multiplication  is="+result);
				break;
				
			case 4:
					System.out.println("Exit");
					break;
			default:
				System.out.println("invalid choice");
				break;

				
			}
			System.out.println("Enter choice again=");
			n=sc.nextInt();
		}while(n!=0);
	}

}
