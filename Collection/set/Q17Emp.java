package assignment_Set;

import java.io.Serializable;
import java.util.HashSet;

class Employee implements Serializable
{
	int id;
	String name;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class Q17Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(1,"Rushi");
		Employee e2=new Employee(2,"Praje");
		Employee e3=new Employee(3,"Amre");
		Employee e4=new Employee(4,"Yogi");
		
		HashSet hs=new HashSet();
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		
		System.out.println(hs);

	}

}
