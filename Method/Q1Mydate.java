package assignment5Methods;

public class Q1Mydate {

	
		
		String day;
		String month;
		String year;
		
		void setdate(String day,String month,String year)
		{
			
			this.day=day;
			this.month=month;
			this.year=year;
		}
		
		
		/*public Q1Mydate() {
			super();
		}


		public Q1Mydate(String day, String month, String year) {
			//super();
			this();
			this.day = day;
			this.month = month;
			this.year = year;
		}*/


		void displaydate()
		{
			System.out.println(this.day);
			System.out.println(this.month);
			System.out.println(this.year);
		}
		
		/*void setdata()
		{
			day="1";
		}
*/
	

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Q1Mydate date=new Q1Mydate();
	date.setdate("21","DEC","2020");
	date.displaydate();
	
}
}