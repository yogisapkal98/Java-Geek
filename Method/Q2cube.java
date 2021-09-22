package assignment5Methods;

public class Q2cube {
	int height;
	int width;
	int depth;
	
	void volcube(int h,int w,int d)
	{
		this.height=h;
		this.width=w;
		this.depth=d;
		long area=h*w*d;
		System.out.println("Area of cube="+area);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2cube vol=new Q2cube();
		vol.volcube(5, 5, 5);
		

	}

}
