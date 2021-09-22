package assignmeny9array;


class Employee1
{
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
	public Employee1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	



}
public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee1 employee1=new Employee1(1,"Rushi",25000);
		Employee1 employee2=new Employee1(2,"Amit",35000);
		Employee1 employee3=new Employee1(3,"Rohan",18000);
		Employee1 employee4=new Employee1(1,"Darshan",19000);
		Employee1 employee5=new Employee1(1,"Sarvesh",11000);
		Employee1 employee11[]=new Employee1[5];
		employee11[0]=employee1;
		employee11[1]=employee2;
		employee11[2]=employee3;
		employee11[3]=employee4;
		employee11[4]=employee5;
		
		Employee1 e=null;
		for(int i=0;i<employee11.length;i++)
		{
			for(int j=i+1;j<employee11.length;j++)
			{
				if(employee11[i].getSalary()<employee11[j].getSalary())
				{
					e=employee11[j];
					employee11[j]=employee11[i];
					employee11[i]=e;		
			    }
				
			}
			System.out.println("Id is"+employee11[i].getId()+" Name is"+employee11[i].getName()+" Salary is"+employee11[i].getSalary());
			  	
			
		}
		
	}

}
