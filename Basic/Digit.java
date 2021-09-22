package basic.program;

public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=123;
		int sum=0,r1=0,r2=0,r3=0;
		System.out.println(no);
		r1=no%10;
		no=no/10;
		System.out.println(no);
		
		r2=no%10;
		no=no/10;
		System.out.println(no);
		
		r3=no%10;
		no=no/10;
		sum=r1+r2+r3;
		System.out.println(sum);
		
	}

}
