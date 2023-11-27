package AnonymnInnerClass;

abstract class doing{
	public abstract void display();
	public abstract void show();
} // abstract class


public class out {
	public static void main(String args[])
	{
		doing ob=new doing()
				{
				public void display() {
					System.out.println("hai");
				}
				public void show()
				{
					System.out.println("im hello");
				}
				};
				
		ob.display();
		ob.show();
	}

}
