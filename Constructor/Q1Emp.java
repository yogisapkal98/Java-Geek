package assignment6Constructor;

public class Q1Emp {
	
	int eid;
	String name;
	String designation;
	int number;
	int salary;
	

	


	public Q1Emp() {
		super();
	}
	
	public Q1Emp(int salary) {
		super();
		this.salary = salary;
	}


	public Q1Emp(int eid, String name, String designation, int number) {
		super();
		this.eid = eid;
		this.name = name;
		this.designation = designation;
		this.number = number;
	}
	
	


	@Override
	public String toString() {
		return "Q1Emp [eid=" + eid + ", name=" + name + ", designation=" + designation + ", number=" + number + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1Emp cal=new Q1Emp(20000);
		System.out.println("Calculated salary is="+cal.salary);
		Q1Emp data=new Q1Emp(101,"Akash","Sr.Eng",98256595);
		System.out.println("Data is="+data);
		

	}

}
