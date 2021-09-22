package assignment12ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Q7 {
	//WAP to check whether checked Exception is propagated in calling stack
	void m1()throws IOException
	{
		m2();
	}
	void m2()throws IOException
	{
		m3();
	}
	void m3()throws IOException
	
	{
		File fis=new File("abc.txt");
		FileInputStream f=new FileInputStream(fis);
		f.close();
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Q7 exp=new Q7();		
		try
		{
			exp.m1();
		}
		finally
		{
			System.out.println("final block ");
		}

	}
}