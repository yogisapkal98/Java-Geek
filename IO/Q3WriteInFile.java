package assignment14InputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Q3WriteInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		FileOutputStream fo;
		ObjectOutputStream oo;
		
		try
		{
			fo=new FileOutputStream("E:\\Q3.txt");
			oo=new ObjectOutputStream(fo);
			
			oo.writeObject(s);
			oo.close();
			fo.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
