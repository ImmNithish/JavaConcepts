package Constructor;

public class Box {
	int length=5;
	int breadth=12;
	
	public Box()// without parametr or default constructor
	{ 
		System.out.println("default excuted");
		   length =5;
		  breadth =1;
		
	}
	public Box(int x,int y) // with two parameters  
	{
		length=x;
		breadth= y;
		
	}
	public Box(int x) {					// single parameters
										/// in this we used all type of parameters hence it is called constructor overloading 
		length=breadth=x;
	}
	
	public int area() {
		return length*breadth;
	
	
	}
public static void main(String args[]) {
	//Box o=new Box();
	//o.area();
	//System.out.println("area of box is without paramter :" +o.area());
	Box o1=new Box(10,4);
	o1.area();
	System.out.println(" area of box with parameter is :" + o1.area());
	//Box o2=new Box(10);
	//o2.area();
	//System.out.println(" area of box with single parameter is :" + o2.area());
}
}

