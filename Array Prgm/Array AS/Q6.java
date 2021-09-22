package assignmeny9array;

public class Q6 {

	
	public static void main(String[] args) {

		int a[]= {50,40,13,11,70,4,2200,6,7,5100};
	int temp;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]>a[j])
				{
					
				  temp= a[i];
				  a[i]=a[j];
				  a[j]=temp;
				
						
				}
				
			}
			
		}
		for( int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		

	}

}


