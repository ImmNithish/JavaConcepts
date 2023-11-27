package Inheritance;

class Shape{
	int length,breadth, radius;
	
}

class rect extends Shape
{
	public rect(int l,int b)// constructor
	{
		length=l;
		breadth=b;
		System.out.println(" your length of rectangle is:" +length);
		System.out.println(" your breadth of rectangle is:" +breadth);
		
	}
	
	public int area ()
	{
		return length*breadth;
	
	}
	
}

class circle extends Shape
{
	public circle(int r)
	
	{
		radius = r;
		System.out.println(" your radius is:"+radius);
	}
	public float area()
	{
		return 3.14f *radius*radius;
}
}

class square extends Shape
{
	public square(int l)
	{
		length=l;

		System.out.println(" your length of square is:" +length);
		
	}
	public float area()
	{
		return length*length;
}
}

public class HeirarchicalInheritance {
	public static void main(String args[]) {
		rect o1= new rect(15,20);
		System.out.println(" area of recatngle is:" +o1.area());
		circle o2=new circle(45);
		System.out.println(" area of recatngle is:" +o2.area());
		square o3=new square(22);
		System.out.println(" area of recatngle is:" +o3.area());
	}
}	
		
		
	
