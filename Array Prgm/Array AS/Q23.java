package assignmeny9array;



class Q23a
{

void copy(char s1[],char s2[],char s3[],int s1_len,int s2_len)
{
	s3=new char[s1_len+s2_len];
	int j=0,k=0;
	for(int i=0;i<s3.length;i++)
	{
		if(i%2==0)
		{
		s3[i]=s1[j];
		j++;
		}
	
		else
		{
			s3[i]=s2[k];
			k++;
			
		}
		
	}
	for(int i=0;i<s3.length;i++)
	{
		System.out.print(s3[i]+"  ");
	}
}


}
public class Q23 {

	public static void main(String[] args) {

		char s1[]={'a','b','c','d'};
		char s2[]={'w','x','y','z'};
		char s3[]=null;
		Q23a q23a=new Q23a();
		q23a.copy(s1, s2, s3,s1.length,s2.length);
	}
}
