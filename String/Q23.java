package Assignment_String;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "7584";
		char a[]= str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					char temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	
		}
		str=String.valueOf(a);
		System.out.println(str);

	}

}






