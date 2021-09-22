package assignment9Abstract;

abstract class Parent
{
	abstract void method1();
	void method2()
	{
		System.out.println("implimentation of method 2");
	}
}

class Child extends Parent
{

	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("Överrided method of parent in child");
		
	}
	
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child a1=new Child();
		a1.method1();
		a1.method2();

	}

}
