package Inheritance;

class Father1 {// base class

	public void house()
	{
		System.out.println(" having house");
		
	}
	/*public void bike()
	{
		System.out.println(" having own bike");
		
	}
*/	
}
class Son extends Father1 {// derivedd class

	public void mobile () 
	{
		System.out.println(" having own mobile");
	}
	
	public void cycle()
		{
			System.out.println(" having own  cylce");
		}
	}


public class SingleInheritance {
	
	public static void main(String args[]) {
		Son obj=new Son();
		System.out.println("----- single inheritance is running-----");
		obj.cycle();
		obj.mobile();
		System.out.println("-----fathers propeties inherited by son----");
		//obj.bike();
		obj.house();
	}
	}
