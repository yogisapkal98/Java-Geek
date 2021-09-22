package assignmeny9array;


public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{22,31,9},{12,25,16},{11,15,18}};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			max=Integer.MIN_VALUE;
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			System.out.println(max);

		}

		

	}

}
