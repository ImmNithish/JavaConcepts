package Inheritance;

 class Grandfather//base class
{
	
	public void land()
	{
	System.out.println(" having land in 1940's");

	}
}

 class Father extends Grandfather // derived class 1
{
	public void house()
	{
	System.out.println("having house in 1980's");	
	}
	
}
 class Grandson extends Father// derived class 2
{
	public void cycle()
	{
		System.out.println(" having cycle in 2000's ");
	}
}

public class MultilevelInheritance {
	public static void main(String args[]) {
		Grandson obj=new Grandson();
		obj.cycle();
		obj.house();
		obj.land();
	}

}
