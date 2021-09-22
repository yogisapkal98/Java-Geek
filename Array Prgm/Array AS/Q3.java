package assignmeny9array;

	import java.util.Scanner;
	public class Q3 {


		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
			
	      
			System.out.println("Enter size of array : ");
			int size1 = scanner.nextInt();
	        int arr1[] = new int[size1];
			System.out.println("Enter " +size1+ " Elements : ");
	        int i,j,k,l,m;
			for(i=0;i<size1;i++)
			{
		     	   arr1[i]=scanner.nextInt();
			}
			
			
			System.out.println("Enter size of array : ");
			int size2 = scanner.nextInt();        
			int arr2[] = new int[size2];
			System.out.println("Enter " +size2+ " Elements : ");
			for(j=0;j<size2;j++)
			{
		     	   arr2[j]=scanner.nextInt();
			}
			
			
			int temp = size1 + size2;		
			
			int arr3[]=new int[temp];
			int pos = 0;
		
			for(k=0;k<size1;k++)
			{
		    	arr3[pos]=arr1[k];
			    pos++;
	    	}
			
			for(l=0;l<size2;l++)
			{
		    	arr3[pos]=arr2[l];
			    pos++;
	    	}
			for(m=0;m<arr3.length;m++)
			{
				System.out.println(arr3[m]);
			}
	 }
	}

