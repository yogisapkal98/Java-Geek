package assignment8Containment;

 class Q2a {
int id;
String name;
int salary=15000;
String department;
String date;


void display(Department d,Date d1)
{
	
	System.out.println("department details");
	System.out.println(+d.dept_id+" "+d.dept_name);
	System.out.println("Date is");
	System.out.println(+d1.day+"  "+d1.month+"  "+d1.year);
	System.out.println("Salary is"+salary);
	
	}

 }
class Department
 {
	
	int dept_id;
	String dept_name;
	public Department(int dept_id, String dept_name) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}
	


 }

class Date


{
	int day;
	String month;
	int year;
	public Date(int day, String month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	






}
 
 public class Q2
 {
	 
	 public static void main(String[] args) {
		Department d=new Department(1,"Computer");
		Date d1=new Date(14,"Sept",2018);
		Q2a q2a=new Q2a();
		q2a.display(d, d1);
	}
 }
