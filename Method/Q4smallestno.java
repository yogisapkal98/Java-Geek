package assignment5Methods;

public class Q4smallestno {
	
	int a;
	int b;
	int c;
	
	void small(int a1,int b1,int c1)
	{
		this.a=a1;
		this.b=b1;
		this.c=c1;
		if(a1>b1 && a1>c1)
		{
			System.out.println("A1 is greater="+a1);
		}
		else if(b1>a1 && b1>c1)
		{
			System.out.println("B1 is Greater="+b1);
		}
		else 
			//if(c1>a1 && c1>b1)
		{
			System.out.println("C1 is greater="+c1);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q4smallestno small1=new Q4smallestno();
		small1.small(20, 22, 18);
		

	}

}
