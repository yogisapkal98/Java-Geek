package assignment7inheritance;

class Department
{
	int deptid;
	String deptname;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
}
	class Student extends Department
	{
		int rollno;
		String studname;
		public  Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int rollno, String studname) {
			super();
			this.rollno = rollno;
			this.studname = studname;
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getStudname() {
			return studname;
		}
		public void setStudname(String studname) {
			this.studname = studname;
		}
}
	public  class Q3Depertment {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Department dept=new Department(101,"BCS");
			Student stud=new Student(12,"Yogesh");
			System.out.println("roll no: "+stud.getRollno());
			System.out.println("stud name: "+stud.getStudname());
			System.out.println("dept id: "+dept.getDeptid());
			System.out.println("dept name: "+dept.getDeptname());
			
		}

	}

