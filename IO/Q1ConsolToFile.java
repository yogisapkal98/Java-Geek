package assignment14InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Q1ConsolToFile {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String a=sc.next();
		
		File f=new File("abc.txt");
		try
		{
			FileOutputStream fi=new FileOutputStream(f);
			ObjectOutputStream fo=new ObjectOutputStream(fi);
			fo.writeObject(a);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
