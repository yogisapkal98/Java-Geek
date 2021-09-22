package Assignment_String;

public class Q16 {

		public static void main(String[] args) {
			String str = "Yogesh";
			String temp="";
			
			for(int i=0;i<str.length();i++)
			{
				temp=temp+str.charAt(i);
				temp=temp+str.charAt(i);
			}
			
			System.out.println(temp);

		}

	}
