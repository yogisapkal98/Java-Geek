package Assignment_String;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "    Welcome to java programming   ";
		int fscount=0,tscount=0;
		
		int i=0;
		while(str.charAt(i++)==' ')
		{
			fscount++;
		}
		i=str.length()-1;
		while(str.charAt(i--)==' ')
		{
			tscount++;
		}
		char temp[] = new char[str.length()-fscount-tscount];
		for(i=0;i<temp.length;i++)
		{
			temp[i]=str.charAt(i+fscount);
		}
		str=String.copyValueOf(temp);
		System.out.println(str);
	}
}