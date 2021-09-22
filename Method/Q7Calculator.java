package assignment5Methods;

public class Q7Calculator {
	
	int calsum(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
	int caldiff(int a,int b)
	{
		int diff=a-b;
		return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q7Calculator cal=new Q7Calculator();
		
		System.out.println(cal.calsum(23, 22));
		System.out.println(cal.caldiff(65, 15));

	}

}
