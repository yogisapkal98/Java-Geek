package assignment_Sorting;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;

class Emp2 implements Serializable,Comparable<Emp2>
{
	int age;
	String name;
	int salary;
	public Emp2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp2(int age, String name, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	@Override
	public String toString() {
		return "Emp2 [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Emp2 o) {
		// TODO Auto-generated method stub
		if(this.getSalary()==o.getSalary())
		{
			return 0;
		}
		else if(this.getSalary()<o.getSalary())
		{
			return -1;
			
		}
		else
		return +1;
	}
	
	
}

class Srtname implements Comparator<Emp2>
{

	@Override
	public int compare(Emp2 o1, Emp2 o2) {
		// TODO Auto-generated method stub
		
		return (o1.getName().compareTo(o2.getName()));
	}
	
}

public class Q7SortEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp2 e1=new Emp2(11,"Yogi",15000);
		Emp2 e2=new Emp2(12,"Rushi",55000);
		Emp2 e3=new Emp2(13,"Vaish",45000);
		Emp2 e4=new Emp2(14,"Amre",5000);
		Emp2 e5=new Emp2(15,"Praje",85000);
		
		ArrayList a=new ArrayList();
		
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		
		Srtname sn=new Srtname();
		
		Collections.sort(a, sn);
		
		Enumeration e=Collections.enumeration(a);
		
		while(e.hasMoreElements())
		{
			Object o=e.nextElement();
			System.out.println(o);
		}

	}

}
