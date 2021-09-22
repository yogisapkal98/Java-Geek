package assignmeny9array;

public class Q26 {

	public static void main(String[] args) {
		int k=1;
		int arr[][]=new int [3][3];
		// Array Element adding....
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=k;
				k++;
			}
		}
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==j)
					ans=ans+arr[i][j];
				if(i==arr.length-1-j)
					ans=ans+arr[i][j];
			}
		}
		if(arr.length%2!=0)
		{
			int i=arr.length/2;
			ans=ans-arr[i][i];
		}
		System.out.println("Answer : "+ans);


		// Rotating array....
		System.out.println("Original Array : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length-i-1;j++)
			{
				int temp = arr[i][j];
				arr[i][j] = arr[j][arr.length-1-i];
				arr[j][arr.length-1-i] = arr[arr.length-1-i][arr.length-1-j];
				arr[arr.length-1-i][arr.length-1-j] = arr[arr.length-1-j][i];
				arr[arr.length-1-j][i] = temp;
			}
		}
		
		System.out.println("Left Rotation :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}	
		}

}
