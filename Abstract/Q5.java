package assignment9Abstract;

interface Cake
{
	void cake();
}

class Strawberry implements Cake
{

	@Override
	public void cake() {
		// TODO Auto-generated method stub
		System.out.println("strawberry  cake is ready ");
	}
	
}
class Blackforest implements Cake
{

	@Override
	public void cake() {
		// TODO Auto-generated method stub
		System.out.println("black forest cake is ready");
	}
	
}
interface Icecream
{
	void eat();
	void juice();
	void drink();
}

class Mango implements Cake,Icecream
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eating mango");
	}

	@Override
	public void juice() {
		// TODO Auto-generated method stub
		System.out.println("drinkin mango juice");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("pure juice");
	}

	@Override
	public void cake() {
		// TODO Auto-generated method stub
		System.out.println("ICE cake");
	}
	
}
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake c=new  Strawberry ();
		c.cake();
		c=new Blackforest();
		c.cake();
		Icecream i=new Mango();
		i.eat();
		i.drink();
		i.juice();
	}

}

