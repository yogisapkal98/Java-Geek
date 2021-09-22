package Assignment_String;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="madam";
		char b='m';
	String temp="";
		for(int i=0;i<a.length();i++)
		{
		
				
		   if((a.charAt(i)!=b))	
		   {
			 temp=temp+a.charAt(i);
			 
		   }
		}
		a=temp;
		System.out.println(a);
			
		}
		
	}

