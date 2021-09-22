package assignment5Methods;

public class Q5Overloaded {
	
	void test()
	{
		
	}
	
	int test(int a,int b)
	{
		return a*b;
	}
	
	int test(int a,int b,int c)
	{
		return a*b*c;
	}
	
	int test(int a,int b,int c,int d)
	{
		return a*b*c*d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q5Overloaded a1=new Q5Overloaded();
		System.out.println(a1.test(2, 5));
		System.out.println(a1.test(4, 3, 1));
		System.out.println(a1.test(2, 2, 4, 4));

	}

}
