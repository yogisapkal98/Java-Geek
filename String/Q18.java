package Assignment_String;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="   JAVA IS PROGRAMMING LANGUAGE   ";
		int fc=0;
		int bc=0;
		
		int i=0;
		
		while(s.charAt(i++)==' ')
		{
			
			
			++fc;
		}
		
		i=s.length()-1;
		
		while(s.charAt(i--)==' ')
		{
			++bc;
		}
		
		char t[]=new char[s.length()-fc-bc];
		
		for(i=0;i<t.length;i++)
		{
			t[i]=s.charAt(i+fc);
		}
		
		s=String.valueOf(t);
		System.out.println(s);
	}

}