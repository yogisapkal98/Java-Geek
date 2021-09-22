package assignmeny9array;


class Student
{

	int rollno;
	String name;
	int marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

}
public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1=new Student(1,"Rushi",75);
		Student student2=new Student(2,"Rohan",76);
		Student student3=new Student(3,"Amit",69);
		Student student4=new Student(4,"sarvesh",45);
		Student student5=new Student(5,"Darshan",67);
		Student student6=new Student(6,"Akshay",85);
		Student student7=new Student(7,"Shubham",49);
		Student student8=new Student(8,"Saurabh",87);
		Student student9=new Student(9,"Rahul",79);
		Student student10=new Student(10,"Yogesh",65);
		Student student[]=new Student[10];
		student[0]=student1;
		student[1]=student2;
		student[2]=student3;
		student[3]=student4;
		student[4]=student5;
		student[5]=student6;
		student[6]=student7;
		student[7]=student8;
		student[8]=student9;
		student[9]=student10;

		int max=student[0].getMarks();
		Student ss=null;
        
		for(int i=0;i<student.length;i++)
		{
		    if(max<student[i].getMarks())
		    {
		    	max=student[i].getMarks();
		    	ss=student[i];
		    	
		    }
		}
		System.out.println("maximum marks    "+max);
		System.out.println("Roo no is"+ss.getRollno()+" name is"+ss.getName());
		
		
		


	}

}
