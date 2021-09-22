package assignmeny9array;


 class Employee {
	 
	 int id;
	 String name;
	 int salary;
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		Employee employee1=new Employee(101,"prajakta",12000);
		Employee employee2=new Employee(102,"Rushi",13000);
		Employee employee3=new Employee(103,"Yogesh",15000);
		Employee employee4=new Employee(104,"Geeta",13000);
		Employee e[]=new Employee[4];
		e[0]=employee1;
		e[1]=employee2;
		e[2]=employee3;
		e[3]=employee4;
		for(int i=0;i<e.length;i++)
		{
			for(int j=i+1;j<e.length;j++)
			{
			if(e[i].getSalary()==e[j].getSalary())
			{
				System.out.println(e[i].getId()+" "+e[i].getName()+" "+e[i].getSalary());
				System.out.println(e[j].getId()+" "+e[j].getName()+" "+e[j].getSalary());
			}
		}
		}

   }

}
