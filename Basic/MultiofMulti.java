package basic.program;

public class MultiofMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=454;
		int r;
		int sum=0;
		while(n>9)
		{
			while(n>0)
			{
				r=n%10;
				n=n/10;
				sum=sum*r;
			}
			n=sum;
			System.out.println(n);
		}
//System.out.println(n);
	}

}
