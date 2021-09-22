package assignment6Constructor;
	
	class Department
	{
		
		int did;
		String dname;
		String dbranch;
		void teaching()
		{
			System.out.println("Teaching method of Department");
		}
	}
	public class Q8College {
		
		void faculty()
		{
			System.out.println("College Method");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q8College a1=new Q8College();
		a1.faculty();
	   Department ds = new Department();
	   ds.teaching();

	}
	}