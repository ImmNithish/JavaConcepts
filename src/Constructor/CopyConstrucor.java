package Constructor;

public class CopyConstrucor {

	int a;
	int b;
	// instance variable
	
	
	public CopyConstrucor(int a, int b)
	{
		this.a=a;
		this.b=b;
	System.out.println("parameterized constructor is called...");
	}
	
	public CopyConstrucor(CopyConstrucor c)// passing object  of the same class as parameter
	{	
		a=c.a;
		b=c.b;
		System.out.println("copy constructor is called ...");
	
	}
	
	public void display()
	
	{
		System.out.println("a = " +a );
		System.out.println("b = " +b );
	}
	
	
	public static void main(String[] args) {
		CopyConstrucor obj1= new CopyConstrucor(5,12);
		CopyConstrucor obj2= new CopyConstrucor(obj1);// passing obj to another obj
		obj1.display();
	//	obj2.display();
			/* we also can change the values of the copy constrcutor */
		obj2.a=100;
		obj2.b=150;
		obj2.display();
		
	}

}
