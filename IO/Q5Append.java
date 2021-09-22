package assignment14InputOutput;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q5Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to add");
		String s1=sc.next();
		FileWriter fw;
		BufferedWriter br;
		try {
			fw=new FileWriter("E:\\append.txt",true);
			br=new BufferedWriter(fw);
			br.write(s1);
			br.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
