package basic.program; 

public class Atmpin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin=2455;
		char user='a';
		int password=345;
		if(pin>1000 && pin<10000)
		{
			if(user=='a' && password==345)
			{
				System.out.println("LOGIN SUCCESSFUL");
			}
			else
			{
				System.out.println("Name & password incorrect");
			}
			
		}
		else
		{
			System.out.println("Password is incorrect");
		}

	}

}
