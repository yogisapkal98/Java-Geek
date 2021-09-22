package assignmeny9array;

import java.util.Scanner;

/*
Q1..WAP to create 1D array and accept data in that array.
    Calculate the average value of array elements.
*/
public class Q1 {



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int size = scanner.nextInt();
        
		int arr[] = new int[size];
		System.out.println("Enter " +size+ " Elements : ");

		int i=0,sum=0;
		for(i=0;i<size;i++)
		{
	     	   arr[i]=scanner.nextInt();
				sum = sum + arr[i];

		}
		
		float avg = sum / size;
		System.out.println("Sum of all elements = "+sum);
		System.out.println("Average = "+avg);
	}
}

