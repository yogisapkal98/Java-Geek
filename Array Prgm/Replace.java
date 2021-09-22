package arrayPractice;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={12,3,25,45,8,90};
		int e=12;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==e)
			{
				a[i]=23;
			}System.out.println(a[i]);
		}

	}

}
