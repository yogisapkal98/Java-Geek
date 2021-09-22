package assignment7inheritance;

class emp
{
	int empid;
	String empname;
	float bas_sal;
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public emp(int empid, String empname, float bas_sal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.bas_sal = bas_sal;
	}
}

class manager1 extends emp
{
	int managerid;
	String managername;
	float basic_sal;
	public manager1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public manager1(int empid, String empname, float bas_sal) {
		super(empid, empname, bas_sal);
		// TODO Auto-generated constructor stub
	}
	void calculatetravelallownsmaneger(float basic_sal)
	{
		float travelallowns=((float)15/100)*basic_sal;
		System.out.println("travel allowans maneger :"+ travelallowns);

		float totalsal=travelallowns+bas_sal;
		System.out.println("total sal manager :"+totalsal);

	}
	void display()
	{
		System.out.println("id: "+this.empid);
		System.out.println("name: "+this.empname);
		System.out.println("basic sal"+this.bas_sal);
	}

}
class  Traniee1 extends emp
{
	int tid;
	String tname;
	float travelallowns;
	public Traniee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Traniee1(int empid, String empname, float bas_sal) {
		super(empid, empname, bas_sal);
		// TODO Auto-generated constructor stub
	}
	void calculatetravelallownstraniee1(float basic_sal)
	{
		float travelallowns=(float)10/100*basic_sal;
		System.out.println("travel allowans traniee1 :"+ travelallowns);
		
			float totalsal=travelallowns+bas_sal;
			System.out.println("total sal traniee:"+totalsal);
	}
	void display()
	{
		System.out.println("id: "+this.empid);
		System.out.println("name: "+this.empname);
		System.out.println("basic sal: "+this.bas_sal);
	}
}
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e=new emp();
		manager1 manager=new manager1(101,"Sahil",45000f);
		manager.display();
		manager.calculatetravelallownsmaneger(45000f);
		System.out.println("======================");
		Traniee1 t= new Traniee1(111,"Vinay",35000f);
		t.display();
		t.calculatetravelallownstraniee1(35000f);
	}

}
