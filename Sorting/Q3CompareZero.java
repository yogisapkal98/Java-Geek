package assignment_Sorting;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

class Sub implements Serializable,Comparable<Sub>
{
	int id;
	String name;
	public Sub() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sub(int id, String name) {
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
		return "Sub [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Sub o) {
		// TODO Auto-generated method stub
		if(this.getId()==o.getId())
		{
			return 0;
		}
		else if(this.getId()<o.getId())
		{
			return 0;
		}
		else
		return 0;
	}
	
	
}

public class Q3CompareZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s1=new Sub(10,"Java");
		Sub s2=new Sub(11,"Angular");
		Sub s3=new Sub(16,"CPP");
		Sub s4=new Sub(5,"SQL");
		
		ArrayList a=new ArrayList();
		
		a.add(s1);
		a.add(s3);
		a.add(s2);
		a.add(s4);
		
		Collections.sort(a);
		
		Enumeration e=Collections.enumeration(a);
		
		while(e.hasMoreElements())
		{
			Object o=e.nextElement();
			System.out.println(o);
		}
		

	}

}
