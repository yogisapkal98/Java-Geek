package Assignment_String;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String a=new String("mumbaiiscaptitalofindia");
		String b="";
		boolean flag=false;

		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch==' ')
				continue;

			flag=false;

			for(int j=0;j<b.length();j++)
			{

				if(ch==b.charAt(j))
				{
                  flag=true;
                  break;

				}
				
			}
				
				if(flag==false)
				{
					b=b+a.charAt(i);
				}
			}
			System.out.println(b);
			
			for(int i=0;i<b.length();i++)
			{
				int count=0;
				for(int j=0;j<a.length();j++)
				{
					if(b.charAt(i)==a.charAt(j))
					{
						count=count+1;
					}
				}
				System.out.println(b.charAt(i)+"="+count);
				
			}

		}



	}


