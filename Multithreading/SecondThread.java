package multithreading.prac;

public class SecondThread extends Thread{
	Pattern p1;
	
	SecondThread(Pattern p1)
	{
		this.p1=p1;
	}
	public void run()
	{
		p1.displayP('#');
		p1.method2("&&");
		p1.method3('$');
	}
	
	

}
