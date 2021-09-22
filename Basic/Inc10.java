package basic.program;

public class Inc10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=20;
		int sum=0;
		int i=0;
		
		
		System.out.println(num1);
		
		for(i=1;i<6;i++)
		{
			System.out.println(num2);
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
		}

	}

}
