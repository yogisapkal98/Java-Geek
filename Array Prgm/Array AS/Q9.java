package assignmeny9array;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		                               
		int a[]={14,15,11,24,25,45,2};
		
		int max=0;
		int min=0;
		max=a[0];
		min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
	
			
			if(max<a[i])
			{
				max=a[i];
						
			}
			
		}
		
		System.out.println("Maximun elements in the array is"+max);
		   
		for(int i=0;i<a.length;i++)
		{
			
			if(min>a[i])
			{
				min=a[i];
						
			}
		
		}
		
		System.out.println("Minimun elements in the array is"+min);
		
		
	}

}
