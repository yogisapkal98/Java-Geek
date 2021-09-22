package assignmeny9array;


public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,29,18,20};
		int r=0;
		int temp;
		int i;
		
		
		
		for( i=0;i<a.length;i++)
		{
			temp=a[i];
			while(temp>0)
			{
				r=temp%10;
				if(r==0)
				{
					a[i]=a[i]+1;
				}
				temp=temp/10;
			}

			System.out.print(a[i]+"   ");

		}


	}

}
