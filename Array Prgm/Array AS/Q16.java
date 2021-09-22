package assignmeny9array;


public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,5},{3,7},{4,5}};
		int b[][]={{1,4},{4,9},{4,5}};
		int c[][]=new int[3][2];
		System.out.println("first matrix");

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
				
			}
			System.out.println();
			
		}
		System.out.println("second matrix");

		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(" "+b[i][j]);
				
			}
			System.out.println();
			
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				
			}
			
		}
		System.out.println("addition of two matrix");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(" "+c[i][j]);
				
			}
			System.out.println();
			
		}
		

		

	}

}
