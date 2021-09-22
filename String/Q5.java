
package Assignment_String;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;

		String a=new String("Yogesh Rajendra Sapkal");
		
	
		for(int i=0;i<a.length();i++)
		{
			
			if(a.charAt(i)==' ' && a.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println("total number of words are"+(count+1));
	}

}
