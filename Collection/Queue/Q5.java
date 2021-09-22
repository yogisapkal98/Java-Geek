package assignment_Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Student
{
	private int id;
	private String name;
	public Student(int id, String name) {
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
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

public class Q5 {
//	WAP to create a Queue with user defined class objects & amp;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue=new LinkedList ();
		
		queue.add(new Student(101,"rahul"));
		queue.add(new Student(102,"ranjeet"));
		queue.add(new Student(103,"vishal"));
		queue.add(new Student(104,"rohit"));
		queue.add(new Student(105,"avi"));
		
		Iterator itr=queue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//System.out.println(queue);
		
	}

}
