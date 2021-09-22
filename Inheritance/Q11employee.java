package assignment7inheritance;

class Employee11
{
	long empid;
	String empname;
	String empaddress;
	long phonenumber;
	double basic_sal;
	double specialallowns=250.80;
	double hra=1000.50;
	public Employee11() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee11(long empid, String empname, String empaddress, long phonenumber) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
		this.phonenumber = phonenumber;
	}
	void calculatesalary(double basic_sal2)
	{
		basic_sal2=25000;
		double salary=basic_sal2+(basic_sal2*(this.specialallowns/100))+(basic_sal2*(this.hra/100));
		System.out.println("calculate salary manager: "+salary);
	}
	
	void calculateallowns(double allowns,double basic_sal)
	{
		
		allowns=20;
		double specialallowns=(20/100)*this.basic_sal;
	}
}
class Manager extends Employee11
{
	long empid;
	String empname;
	String empaddress;
	long phonenumber;
	double basic_sal;
	int  allowns;
	public Manager(long empid, String empname, String empaddress, long phonenumber, double basic_sal) 
	{
		super();
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
		this.phonenumber = phonenumber;
		this.basic_sal = basic_sal;
	}
	public void calculateallowns1(double allowns)
	{
		double specialallowns=(20/100)*this.basic_sal;
		System.out.println("special allowns :"+specialallowns);
	}
	
	
}
class Traniee extends Employee11
{
	long empid;
	String empname;
	String empaddress;
	long phonenumber;
	double basic_sal;
	public Traniee(long empid, String empname, String empaddress, long phonenumber, double basic_sal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
		this.phonenumber = phonenumber;
		this.basic_sal = basic_sal;
	}
	
}
public class Q11employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee11 emp=new Employee11();
		Manager manager=new Manager(101,"Yogesh","Pune",7558445666l,45000l);
		manager.calculatesalary(manager.basic_sal);
		manager.calculateallowns1(20);
		Traniee  t=new Traniee(111,"Rushikesh","Nagar",9096491473l,45000l);
		//t.calculatesalary(t.basic_sal);
	}

}
