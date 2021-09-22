package arrayPractice;

public class StringDemoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="AAAABBBBCCCDD";
		int count=1;
		String temp="";
		String t=Character.toString(a.charAt(0));
		
		for(int i=0;i<a.length()-1;i++)
		{
			if(t.equals(a.charAt(i)))
			{
				count=count+1;
			}
			else
			{
				temp=temp+(String)t+Integer.toString(count);
			}
			
		}
		System.out.println(temp);
		System.out.println(count);
		
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==a.charAt(i+1))
				count++;
			{
				//a.charAt(i)++;
				System.out.println(count+a);
			}	
			
/*88888888
  7777777
  666666
  55555
  4444
  333
  22
  1*/
		
		/*for(int i=8;i>=1;i--)
		{
			for(int j=1;j<=8;j++)
			{
				if(j<=i)
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}*/
	}

}
}
