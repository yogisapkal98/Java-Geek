package assignment9Abstract;

abstract class Abstract1
{
	
	abstract void doAbstract1();
	
	
}

abstract class Abstract2
{
	
	abstract void doabstract2();
}

class demo extends Abstract1
{

	@Override
	void doAbstract1() {
		// TODO Auto-generated method stub
		System.out.println(" Abstract method of 1");
		
	}
	
}

class demo2 extends Abstract2
{

	@Override
	void doabstract2() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method of 2");
		
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo a1=new demo();
		a1.doAbstract1();
		
		demo2 a2=new demo2();
		a2.doabstract2();
		
		
		

	}

}
