package assignment_Sorting;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

class Stud1 implements Serializable,Comparable<Stud1>
{
	int id;
	String name;
	public Stud1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stud1(int id, String name) {
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
		return "Stud1 [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Stud1 o) {
		// TODO Auto-generated method stub
		if(this.getId()==o.getId())
		{
			return +1;
		}
		else if(this.getId()<o.getId())
		{
			return +1;
		}
		else
		return +1;
	}
	
}

public class Q1ComparePlus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud1 s1=new Stud1(1,"Yogi");
		Stud1 s2=new Stud1(4,"Rushi");
		Stud1 s3=new Stud1(2,"Praje");
		Stud1 s4=new Stud1(3,"Amre");
		
		List l=new ArrayList();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		
		System.out.println(l);
		
		Collections.sort(l);
		
		Enumeration e=Collections.enumeration(l);
		
		while(e.hasMoreElements())
		{
			Object o=e.nextElement();
			System.out.println(o);
		}

	}

}
