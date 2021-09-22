package assignment_Map;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Student implements Serializable
{
	Integer id;
	String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

class Cid implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return(o1.getId().compareTo(o2.getId()));
		/*	return 0;
		else if(o1.getId()<o2.getId())
			return -1;
		else
			return 1;*/
	}

}

public class Q13Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Student s1=new Student(10,"Yogi");
		Student s2=new Student(8,"Rushi");
		Student s3=new Student(11,"Amre");
		Student s4=new Student(5,"Praje");
		
		Cid e=new Cid();

		TreeMap t=new TreeMap(e);

		t.put(s1, 45);
		t.put(s2, 80);
		t.put(s3, 49);
		t.put(s4, 11);

		
		
		System.out.println(t);

		/*Set set=new TreeSet();

		Iterator itr=set.iterator();

		while(itr.hasNext())
		{
			Object o=itr.next();
			Map.Entry me=(Map.Entry)o;
			System.out.println(me);
		}*/


	}

}
