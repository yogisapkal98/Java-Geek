package assignment7inheritance;

class KidBook
{
	String bookname;
	String bookname2;
	public void readbook()
	{
		System.out.println("kids book ");
		System.out.println("reading Cars Comic");
	}
	public void readbook(String  bookname,String bookanme)
	{
		this.bookname=bookname;
		
		System.out.println("reading book:"+bookname);
	}
}
class BigkidsBook extends KidBook
{
	public void read1(String bookname)
	{
		System.out.println("============");
		System.out.println("big kids book");
		System.out.println("reading Novel book :"+bookname);
	}
	public void readbook(String bookname )
	{
		System.out.println("reading book: "+bookname);
	}
}
public class Q7kidbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidBook kid=new KidBook();
		kid.readbook();
		kid.readbook("cartoon","Cars Comic");
		BigkidsBook big=new BigkidsBook();
		big.read1("The Journey Home");
		big.readbook("java");
	}

}
