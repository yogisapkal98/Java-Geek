package Assignment_String;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	StringBuffer stringbuffer1=new StringBuffer("Rushikesh");
		StringBuffer stringbuffer2=new StringBuffer("Yogesh");
		StringBuffer stringbuffer3=new StringBuffer("Amruta");
		StringBuffer stringbuffer4=new StringBuffer("Prajakta"); 
		StringBuffer stringbuffer5=new StringBuffer("Geeta");
		StringBuffer stringbuffer6=new StringBuffer("Vaishnavi");
		StringBuffer stringbuffer7=new StringBuffer("Monika");
		StringBuffer stringbuffer8=new StringBuffer("Rahul");
		StringBuffer stringbuffer9=new StringBuffer("Darshan");
		StringBuffer stringbuffer10=new StringBuffer("Rohan");
		
		StringBuffer stringbuffer[]=new StringBuffer[10];
		
		stringbuffer[0]=stringbuffer1;
		stringbuffer[1]=stringbuffer2;
		stringbuffer[2]=stringbuffer3;
		stringbuffer[3]=stringbuffer4;
		stringbuffer[4]=stringbuffer5;
		stringbuffer[5]=stringbuffer6;
		stringbuffer[6]=stringbuffer7;
		stringbuffer[7]=stringbuffer8;
		stringbuffer[8]=stringbuffer9;
		stringbuffer[9]=stringbuffer10;
		

		for(int i=0;i<stringbuffer.length-1;i++)
		{
			for(int j=i+1;j<stringbuffer.length;j++)
			{
				if(stringbuffer[i].equals(stringbuffer[j])==false)
				{
					StringBuffer temp=stringbuffer[i];
					stringbuffer[i]=stringbuffer[j];
					stringbuffer[j]=temp;
				}
			}
		}
		for(int i=0;i<stringbuffer.length;i++)
			System.out.println(stringbuffer[i]);


		
		*/
		
		String s[]={"madam","aba","asdbd","asdsa","Rushi"};
		
		String rev[]=new String[s.length];
		String p[]=new String[s.length];
		
		int k=0;
		
		for(int i=0;i<s.length;i++)
		{
			StringBuffer b=new StringBuffer(s[i]);
			rev[i]=b.reverse().toString();
			
			if(rev[i].equals(s[i]))
			{
				p[k]=s[i];
				k++;
			}
		}
		
		for(int i=0;i<k-1;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				int n=p[i].compareTo(p[j]);
				
				if(n>0)
				{
					//swap
					
					String t;
					t=p[i];
					p[i]=p[j];
					p[j]=t;
					
				}
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.println(p[i]);
		}
	}

}
