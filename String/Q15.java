package Assignment_String;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Yogesh";
		String temp="";
		char ch;
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(s1.charAt(i)>=65 && s1.charAt(i)<=90)
			{	
				ch=(char)(ch+32);
			}
			else if(s1.charAt(i)>=97 && s1.charAt(i)<=122)
			{	
				ch=(char)(ch-32);
			}
			temp=temp+ch;
		}
		
		System.out.println(temp);

	}

}
