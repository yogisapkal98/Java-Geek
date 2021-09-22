package assignmeny9array;

/*   
  Q2..WAP to insert an element in a specific position into an array. 
 */
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter size of array : ");
			int size = scanner.nextInt();
	        
			int arr[] = new int[size];
			System.out.println("Enter " +size+ " Elements : ");

			for(int i=0;i<size;i++)
			{
		     	   arr[i]=scanner.nextInt();
			}
			
			System.out.println("Enter one position : ");
			int ipos = scanner.nextInt();
			
			System.out.println("Enter insert element : ");
			int newElement = scanner.nextInt();
			
			for(int i=0;i<arr.length;i++)
			{
				if(i==ipos)
				{
					arr[i] = newElement;
				}
			}
			int j=arr.length+1;
			for( j=0;j<arr.length;j++)
			{
				System.out.println(arr[j]);
			}
		}
	}
