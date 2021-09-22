package assignment6Constructor;

public class Q2Rectangle {
	
	int length;
	int breadth;
	int both;

	public Q2Rectangle() {
		
		super();
		length=0;
		breadth=0;
	}
	
	
	public Q2Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
		
		int area=length*breadth;
		System.out.println("Area of Rectangle="+area);
		
	}
	
	
	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getBreadth() {
		return breadth;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


	public int getBoth() {
		return both;
	}


	public void setBoth(int both) {
		this.both = both;
	}


	public Q2Rectangle(int both) {
		super();
		this.length = both;
		this.breadth=both;
		
		int area=both*both;
		System.out.println(area+"--Area by both");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q2Rectangle a= new Q2Rectangle();
		System.out.println(a.breadth+" "+" "+a.length);
		
		Q2Rectangle a1= new Q2Rectangle(20,30);
		
		Q2Rectangle a2= new Q2Rectangle(11);
		

	}

}
