package assignment7inheritance;

class Surname
{
	String sname="Sapkal";
	
}
	
class father extends Surname
{
	String fname="Yogesh";
}
class child2 extends father
{
	String mname="Rajendra";
	void display()
	{
		System.out.println(this.fname+" "+this.mname+" "+this.sname);
	}
}
public class Q2multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			child2 ch=new child2();
			ch.display();
	}

}
