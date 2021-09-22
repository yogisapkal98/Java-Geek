package arrayPractice;

public class ReverseTempVeriable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={12,5,6,8,9,78};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int j=0;j<a.length/2;j++)
		{
			int t=0;
			t=a[j];
			a[j]=a[a.length-j-1];
			a[a.length-j-1]=t;
		}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}

	}

}
