package Assignment_String;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String a=new String("madam");
		
		for(int i=0;i<a.length();i++)
		{
			int count=0;
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					count++;
				}
			}
			System.out.println(a.charAt(i)+"="+count);
		}
	}

}
