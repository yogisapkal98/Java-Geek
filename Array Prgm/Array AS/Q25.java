package assignmeny9array;


public class Q25{

	public static void main(String[] args) {
		int a[]={5,1,3,4,7};
		int count = 0,sum=12;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if((a[i]+a[j]+a[k])<sum)
					{
						count++;
						System.out.print("{"+a[i]+","+a[j]+","+a[k]+"} ");
					}
				}
			}
		}
		System.out.println("Total Count : "+count);
	}
}