package basic.program;

public class Veriant {
	public static void main(String args[]) {
		
		for(int i=0;i<59;)
		{
			if(i<=25)
			{
				i=i+5;
				System.out.println(i);
			}
			if(i>=25 && i<39)
			{
				i=i+2;
				System.out.println(i);
			}
			if(i>=39 && i>25)
			{
				i=i+4;
				System.out.println(i);
			}
		}
	}

}
