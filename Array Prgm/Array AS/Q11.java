package assignmeny9array;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5};
		int b[]={1,2,3,4,6};
		boolean flag=false;
		if(a.length!=b.length)
		{
			flag=false;
		}
		else
		{
			for(int i=0;i<a.length;i++)
			{

				if(a[i]==b[i])
				{
					flag=true;
					continue;
				}
				else
				{
					flag=false;
					break;
				}

			}
		}
		if(flag==true)
		{
			System.out.println("both array are equal");

		}
		else
		{
			System.out.println("both array are not equal");

		}
	}}
