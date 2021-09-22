package assignment5Methods;

public class Q6Box {
	
	int height;
	int width;
	int depth;
	
	double volume(int h,int w,int d)
	{
		this.height=h;
		this.width=w;
		this.depth=d;
		
		double vol=h*w*d;
		
		return vol;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q6Box v=new Q6Box();
		
		System.out.println(v.volume(21, 14, 2));

	}

}
