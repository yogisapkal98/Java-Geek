package basic.program;

public class Reverse {
	public static void main(String[] args){
			
	int no=1589751;
	int rev=0;
	int r=0;
	
	for( ;no>0; )
	{
	 r=no%10;
	 no=no/10;
	 rev=rev*10+r;
	 
	 System.out.println(no);
	 System.out.println(r);
	}
	for( ;rev>0; )
	{
		no=rev%10;
		rev=rev/10;
		
	if(no==1)
	{
		System.out.println("ONE");
	}
	if(no==2)
	{
		System.out.println("TWO");
	}
	if(no==3)
	{
		System.out.println("THREE");
	}
	if(no==4)
	{
		System.out.println("FOUR");
	}
	if(no==5)
	{
		System.out.println("FIVE");
	}
	if(no==6)
	{
		System.out.println("SIX");
	}
	if(no==7)
	{
		System.out.println("SEVEN");
	}
	if(no==8)
	{
		System.out.println("EIGHT");
	}
	if(no==9)
	{
		System.out.println("NINE");
	}
	if(no==0)
	{
		System.out.println("ZERO");
	}
	
	}
	}
}

