package Assignment_String;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "This is beautiful place";
		String temp = "";
		boolean flag;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				continue;
			}
			flag=false;
			for(int j=0;j<temp.length();j++)
			{
				if(ch==temp.charAt(j))
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				temp=temp+str.charAt(i);
			}
		}
		
		System.out.println(temp);


	}

}
