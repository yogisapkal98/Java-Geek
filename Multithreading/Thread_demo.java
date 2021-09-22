package multithreading.prac;

public class Thread_demo extends Thread {

	public void run()
	{
		//running state
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"="+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread_demo t1=new Thread_demo();
		Thread_demo t2=new Thread_demo();//new state

		t1.setName("t1");

		t1.start();//runnable state
		t2.start();

		String s=t2.getName();
		System.out.println(s);
		
		System.out.println(t1.getPriority()+" == "+t2.getPriority()+" "+Thread.MAX_PRIORITY);

		System.out.println(Thread.currentThread().getName());

		System.out.println();

	}

}
