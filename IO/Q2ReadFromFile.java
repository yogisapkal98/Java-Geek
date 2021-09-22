package assignment14InputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q2ReadFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		String s;
		File fi=new File("E:\\Read.txt");

		FileReader fr=null;
		try
		{
			fr=new FileReader(fi);

		}

		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		BufferedReader br=new BufferedReader(fr);
		try
		{
			while((s=br.readLine())!=null)
				System.out.println(s);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
