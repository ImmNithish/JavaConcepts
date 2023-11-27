package incrementopereator;

class Test extends Exception
{

	public Test(String string) {
	System.out.println(" catch block ");
	}
	}
	

public class condition {

	
	
	public static void main(String[] args) {
	
	try {
		throw new Test("hi");
		
	}
	catch(Test t)
	{
		System.out.println("ca");
	}
		
	
	finally {
		System.out.println("finally block");
	}
	}

}
