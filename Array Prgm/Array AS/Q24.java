package assignmeny9array;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		int a[][]={{6,3,1},{9,7,8},{2,4,5}};
		
		for(int i=0;i<a.length;i++)
		{
			int min=a[i][0]; int col_index=0;

			for(int j=1;j<a[i].length;j++)
			{
				if(min > a[i][j])
				{
					min=a[i][j];
					col_index=j;
				}
			}
			int k;
			for(k=0;k<a[i].length;k++)
			{
				if(min < a[k][col_index])
					break;
			}
			if(k ==a.length)
				System.out.println("Saddle Point : "+min);
		}

	}

}
