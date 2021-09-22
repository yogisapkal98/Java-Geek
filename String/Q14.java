package Assignment_String;

public class Q14 {

	public static void main(String[] args) {
		String str = "Yogesh";
		String temp = "";
		boolean flag;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
				continue;
			flag=false;
			for(int j=0;j<temp.length();j++)
			{
				if(ch==temp.charAt(j))
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
				temp=temp+str.charAt(i);

		}

		int countarr[] = new int[temp.length()];
		for(int i=0;i<temp.length();i++)
		{
			int count=0;

			for(int j=0;j<str.length();j++)
			{
				if(temp.charAt(i)==str.charAt(j))
					count++;
			}
			countarr[i]=count;
		}
		int min=countarr[0];
		for(int i=0;i<countarr.length;i++)
		{
			if(countarr[i]<min)
			{
				min=countarr[i];
			}

		}
		for(int i=0;i<countarr.length;i++)
		{
			if(countarr[i]==min)
			{
				System.out.println(temp.charAt(i)+" is lowest freq. with "+min);
			}

		}
	}
}