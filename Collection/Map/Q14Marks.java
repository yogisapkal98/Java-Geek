package assignment_Map;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Stud implements Serializable
{
	private int id;
	private String name;
	private int marks;
	public Stud() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stud(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}

public class Q14Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stud s1=new Stud(11,"Yogi",70);
		Stud s2=new Stud(12,"Rushi",60);
		Stud s3=new Stud(13,"Suraj",34);
		Stud s4=new Stud(14,"Amre",55);
		
		HashMap h=new HashMap();
		h.put(s1, s1.getMarks());
		h.put(s2, s2.getMarks());
		h.put(s3, s3.getMarks());
		h.put(s4, s4.getMarks());
		
		Set se=h.entrySet();
		Iterator itr=se.iterator();
		
		List pass=new ArrayList();
		List fail=new ArrayList();
		
		while(itr.hasNext())
		{
			Object ob=itr.next();
			
			Map.Entry me=(Map.Entry)ob;
			Stud t=(Stud) me.getKey();
			
			if(t.getMarks()>=35)
			{
				pass.add(t);
			}
			else
			{
				fail.add(t);
			}
			
		}
		System.out.println("Pass Students are="+pass);
		System.out.println();
		System.out.println("Fail Students are="+fail);

	}

}
