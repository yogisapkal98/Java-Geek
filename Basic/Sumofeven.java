package basic.program;

public class Sumofeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=23494;
		int rev;
		int sum=0;
		while(n>0)
		{
			rev=n%10;
			//n=n/10;
			
			if(rev%2==0)
			{
				sum=sum+rev;
			
			}
			n=n/10;
		}
		System.out.print(sum);

	}

}
