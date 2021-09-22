package assignment_Sorting;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

class stud2 implements Serializable,Comparable<stud2>
{
	int id;
	String name;
	public stud2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public stud2(int id, String name) {
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
		return "stud2 [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(stud2 o) {
		// TODO Auto-generated method stub
		if(this.getId()==o.getId())
		{
			return -1;
		}
		else if(this.getId()<o.getId())
		{
			return -1;
		}
		else
		{
		return -1;
		}
	}
	
}

public class Q2CompareNegative1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stud2 s1=new stud2(2,"Yogi");
		stud2 s2=new stud2(1,"Rushi");
		stud2 s3=new stud2(4,"Vaish");
		stud2 s4=new stud2(3,"Praje");
		
		ArrayList al=new ArrayList();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Collections.sort(al);
		Enumeration e=Collections.enumeration(al);
		
		while(e.hasMoreElements())
		{
			Object o=e.nextElement();
			System.out.println(o);
		}
		

	}

}
