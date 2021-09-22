package assignmeny9array;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={12,-5,-6,-8,12,-1,-9,21,-54};
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println(a[i]);
				count++;
				
			}
		}
		System.out.println("Count of negetive element is");
		System.out.println(count);
	}

}
