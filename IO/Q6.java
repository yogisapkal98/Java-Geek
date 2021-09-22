package assignment14InputOutput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String longest_word = "";
	       String current;
	       Scanner scan = new Scanner(new File("E:\\rahul1.txt"));


	       while (scan.hasNext()) {
	          current = scan.next();
	           if (current.length() > longest_word.length()) {
	             longest_word = current;
	           }

	       }
	         System.out.println("\n"+longest_word+"\n");

	}
}
