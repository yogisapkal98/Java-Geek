package Assignment_String;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=new String("YOGESH");
		String b="";
		
		for(int i=0;i<a.length();i++)
		{
			int k=a.charAt(i);
			b=b+(char)(k+32);
		}
System.out.println(b);
	}

}
