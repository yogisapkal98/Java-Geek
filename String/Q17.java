package Assignment_String;

import java.util.Scanner;

public class Q17 {

	
		
		public static void main(String[] args) {

			String str = "Yogesh";
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Index no. to find character :");
			int index = scan.nextInt();

			if(index<str.length())
			{
				for(int i=0;i<str.length();i++)
				{
					if(i==index)
						System.out.println(str.charAt(i));
				}
			}
			else
				System.out.println("String length is "+str.length()+" Please enter index in length-1");
		}

	}
