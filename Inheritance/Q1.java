package assignment7inheritance;
 
class Parent
{
	public void display()
	{
		System.out.println("this is parent class");
	}
}
class Child extends Parent
{
	public void display()
	{
		System.out.println("this is child class");
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		p.display();
		Child c=new Child();
		c.display();
	}

}
