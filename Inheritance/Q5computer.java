package assignment7inheritance;

class Laptop
{
	int usbport;
	float processorspeed;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int usbport, int processorspeed) {
		super();
		this.usbport = usbport;
		this.processorspeed = processorspeed;
	}
	public int getusbport() {
		return usbport;
	}
	public void setusbport(int usbport) {
		this.usbport = usbport;
	}
	public float getProcessorspeed() {
		return processorspeed;
	}
	public void setProcessorspeed(float processorspeed) {
		this.processorspeed = processorspeed;
	}
	
}
public class Q5computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop lap=new Laptop();
		lap.setusbport(3);
		lap.setProcessorspeed(5.23f);
		System.out.println("usb post: "+lap.getusbport());
		System.out.println("processor speed: "+lap.getProcessorspeed());
	}

}
