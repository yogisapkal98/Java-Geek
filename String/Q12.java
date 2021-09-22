package Assignment_String;

public class Q12 {

	public static void main(String[] args) {
		String str="Yogesh Rajendra Sapkal";
		
		String temp="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' ||ch=='O' || ch=='u' ||ch=='U')
			{
				ch=(char)(ch+1);
			}
			temp=temp+ch;
		}
		
		System.out.println(temp);

	}

}
