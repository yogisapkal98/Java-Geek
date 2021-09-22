package Assignment_String;


public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=new String("welcome to java world");

		for(int i=0;i<s1.length();i++)
		{
			int index = 5;
			if(i==index)
			{
				System.out.println("index character: "+s1.charAt(i));
			}
		}
		System.out.println(s1.compareToIgnoreCase("welcome"));
		String s="let us learn";
		for(int i=0;i<s.length();i++)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println("string concatination is");
		System.out.println(s1);

		String temp="";
		for(int i=0;i<s1.length();i++)
		{

			char ch=s1.charAt(i);
			if(ch=='a')
			{
				ch='e';
			}
			temp=temp+ch;

		}
		System.out.println("replace char :"+temp);

		for(int i=0;i<s1.length();i++)
		{
			if(i>=4 && i<=10)

				System.out.print(s1.charAt(i));
		}
	}
}