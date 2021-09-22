package assignment6Constructor;

public class Q6Shape {
	
	static float pi=3.5f;
	static float radius=12.0f;
	
	public Q6Shape()
	{
		
	}
	
	public Q6Shape(float radius)
	{
		this.radius=radius;
		System.out.println("Redius is  "+radius);
	}
	
	public Q6Shape(float radius,float pi)
	{
		this.pi=pi;
		this.radius=radius;
		System.out.println("2nd const  "+this.pi+" "+this.radius);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q6Shape m1=new Q6Shape();
	
		
		Q6Shape m2=new Q6Shape(radius);
		
		Q6Shape m3=new Q6Shape(radius,pi);

	}

}
