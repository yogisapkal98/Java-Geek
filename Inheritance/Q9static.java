package assignment7inheritance;

class state
{
	static int id=111;
	static String name="Yogesh";
			
}
class child1 extends state
{
	void display()
	{
		System.out.println("id :"+id+" " +"name :"+name);
	}
}
public class Q9static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 chi=new child1();
		chi.display();
	}

}
