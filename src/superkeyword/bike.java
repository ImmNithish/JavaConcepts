package superkeyword;



public class bike extends Vechile{
	
	
	public bike(int wheels)
	{
		super(wheels); // calling immediate parent class constructor by using super keyword method,
	}
	
	public void print()
	{
		super.m1();
		super.m2();// calling immediate parent class Instance method by using super keyword.
		
		System.out.println("Bike  Wheel number as:" + super.wheels);
		
		// calling immediate parent class Instance variable by using super keyword.
	
	}
	

public static void main(String args[]) {

	bike obj=new bike(2);
	obj.print();
	
	
}}

