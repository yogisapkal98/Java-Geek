package assignment6Constructor;

public class Q7CalArea {
	
	float calarea(float r)
	{
		float area=3.14f*r*r;
		return area;
		
	}
	
	float circum(float r)
	{
		float circum=2*3.14f*r;
		return circum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q7CalArea a1=new Q7CalArea();
		System.out.println("Area of circle="+a1.calarea(12.0f));
		
		Q7CalArea a2=new Q7CalArea();
		System.out.println("Circuference of circle="+a2.circum(17.0f));
		

	}

}
