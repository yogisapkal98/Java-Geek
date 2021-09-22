package arrayPractice;

public class ReverseWitheTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={12,3,6,80,7};
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}System.out.println(max+"=Maximum");
		
		for(int j=0;j<a.length;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
			}
		}System.out.println(min+"=Minimum");

	}

}
