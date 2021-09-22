package assignment7inheritance;



class Mathvalue
{
	public final static float pi=3.14f;// the value can not be change
}
class Shape // this class method access from all class
{
	float area=0.0f;
	public void calculatearea()
	{
		System.out.println("this is shape class");
	}
	final void disply()				// this method access  from all classes and he print area of classes 
	{								// this method will be final because  area value does not change
		System.out.println(this.area); 
	}

}

class Circle extends Shape
{
	public void calculatearea()
	{
		area= Mathvalue.pi*8.2f*5.9f;
		System.out.println("this is shape class of circle: ");
	}
}
class Reactangle extends Shape
{
	public void calculatearea()
	{
		area= Mathvalue.pi*7.0f*6.0f;
		System.out.println("this is shape class of ractanle: ");
	}
}
class Square extends Shape{
	public void calculatearea()
	{
		area= Mathvalue.pi*7.5f*5.0f;
		System.out.println("this is shape class of square: ");
	}
}

public class Q8{
	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.calculatearea();
		circle.disply();
		Reactangle react=new Reactangle();
		react.calculatearea();
		react.disply();
		Square squ=new Square();
		squ.calculatearea();
		squ.disply();
	}

}


