package assignment8Containment;

 class Q1 {

	String fullname;
	String address;
	char gender='m';
	int age=22;
	
	

void display(Fullname f,Address a)
{
	System.out.println("Full name is ");
	System.out.println(f.fname+" "+f.mname+" "+f.lname);
	System.out.println("Address is ");
	System.out.println("city is "+a.city+" state is "+a.state+" country is "+a.country);
	System.out.println("Gender is "+this.gender);
	System.out.println("Age is "+this.age);

}
	



 }
class Fullname
{
	String fname;
	String mname;
	String lname;
	Q1 q;
 
	Fullname(String fn,String mn,String ln)
	{
		this.fname=fn;
		this.mname=mn;
		this.lname=ln;
		
		
	}
}
class Address
{
	
String city;
String state;
String country;
Q1 q;
public Address(String city, String state, String country) {
	super();
	this.city = city;
	this.state = state;
	this.country = country;
}
}

 
public class Q1a
{
	public static void main(String[] args)
	{
	
		Fullname f=new Fullname("Yogesh","Rajendra","Sapkal");
		Address a=new Address("Pune","Maharastra","India");
		Q1 q=new Q1();
		q.display(f,a);
		
		
	}


}