package superkeyword;

public class Vechile {
		/*
	 super class Instance variable
	 */
	int wheels;
	int engine=1;
	
	public Vechile(int wheels)
	{
		this.wheels=wheels;
		
	}
	
	public void m1()
	{
		System.out.println("number of engine: " + engine);
	}
	public void m2()
	{
		System.out.println("number of wheels: " +wheels);
	}

}
