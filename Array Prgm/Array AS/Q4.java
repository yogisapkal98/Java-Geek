package assignmeny9array;

public class Q4 {
	public static void main(String[] args) {

		int a[]= {20,39,4,102};
		int start=0;
		int end=a.length;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				start++;
				end--;
				//System.out.println(temp);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
