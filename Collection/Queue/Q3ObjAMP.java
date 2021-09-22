package assignment_Queue;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Queue;

class Emp implements Serializable
{
	int id;
	String name;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name) {
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
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class Q3ObjAMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp(10,"Yogi");
		Emp e2=new Emp(11,"Rushi");
		Emp e3=new Emp(12,"Amre");
		Emp e4=new Emp(13,"Praje");
		Emp e5=new Emp(14,"Vaish");
		
		Queue q=new ArrayDeque();
		
		q.add(e1);
		q.add(e2);
		q.add(e3);
		q.add(e4);
		q.add(e5);
		
		System.out.println(q);

	}

}
