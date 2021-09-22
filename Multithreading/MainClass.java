package multithreading.prac;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p1=new Pattern();
		
		
		FirstThread t1=new FirstThread(p1);
		SecondThread t2=new SecondThread(p1);
		
		t1.start();
		t2.start();
		
		

	}

}
