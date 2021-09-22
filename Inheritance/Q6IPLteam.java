package assignment7inheritance;

class IPL
{
	void play()
	{
		System.out.println("playing cricket");
	}
}
class CSK extends IPL
{
	void display()
	{
		System.out.println("playing cricket csk for last 4 year");
	}
}
class RCB extends IPL
{
	void display()
	{
		System.out.println("playing cricket for RCB in last 2 year");
	}									
}
public class Q6IPLteam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSK csk=new CSK();
		csk.play();
		csk.display();
		RCB rcb=new RCB();
		rcb.play();
		rcb.display();
		
	}

}
