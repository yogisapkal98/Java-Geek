package Assignment_String;

public class Q6 {

	public static void main(String[] args) {
		
		String a="this is this is at ";
		String s=new String("at"); 
		int start=0;
		int last=0;
		int temp=0;
		boolean flag=false;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==' ')
			{
				temp=start;
				last=i;
				start=i+1;
				flag=true;
			}
			if(flag)
			{
				if(a.substring(temp, last).equals(s))
				{
					System.out.println(temp);
					break;
				}
			}
		}
	}
}
