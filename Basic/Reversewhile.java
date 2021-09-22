package basic.program;

public class Reversewhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=4132;
		int rev=0;
		while(num>0)
		{
			rev=num%10;
			num=num/10;
			
		
		System.out.print(rev);
		}
	}

}
