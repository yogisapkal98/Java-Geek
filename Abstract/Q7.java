package assignment9Abstract;

import java.util.Scanner;


import arthmatic.Addition;
import arthmatic.Division;
import arthmatic.Multiplication;
import arthmatic.Subtraction;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add= new Addition();

		Multiplication mul=new Multiplication();

		Subtraction sub=new Subtraction();

		Division div=new Division();

		Scanner sc=new Scanner(System.in);

		while(true)
		{
			System.out.println("1. addition");
			System.out.println("2. multiplication");
			System.out.println("3. subtraction");
			System.out.println("4. division");
			System.out.println("5. exit");

			System.out.println("enter choice");
			int choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				add.add();
				break;
			case 2:
				mul.mul();
				break;
			case 3:
				sub.sub();
				break;

			case 4:
				div.div();
				break;
			case 5:
				System.exit(0);
			}


		}

	}

}

