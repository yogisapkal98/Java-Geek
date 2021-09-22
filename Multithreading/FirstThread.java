package multithreading.prac;

public class FirstThread extends Thread{
	
	Pattern p1;
	FirstThread(Pattern p1)
	{
		this.p1=p1;
	}
	
	public void run()
	{
		p1.displayP('*');
	}

}
