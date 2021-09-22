package assignmeny9array;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={12,11,14,15,17,18,19,20,22,24};
		System.out.println("Even elements are");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				
			}
					
	}
		System.out.println("Odd elements are");
		for(int i=0;i<a.length;i++)

			
		{
			if(a[i]%2==1)
			{
				System.out.println(a[i]);
			}
		}
}
}