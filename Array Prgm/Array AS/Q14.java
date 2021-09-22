package assignmeny9array;


public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]={2,3,4,5};
		int max=b[0];
		int min=b[0];
		for(int i=0;i<b.length;i++)
		{
			if(max<b[i])
			{
				max=b[i];
			}
			if(min>b[i])
			{
				min=b[i];
			}
			
		}
		System.out.println(max);
		System.out.println(min);
		int diff=max-min;
		System.out.println("diff="+diff);



	}

}

