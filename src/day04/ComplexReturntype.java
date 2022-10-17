package day04;

public class ComplexReturntype {
	
	public ChoosingCar showroom()
	{
		System.out.println("welcome to tvs showroom:");
		return new ChoosingCar();
	}
	 public void end() {
		 System.out.println(" thank for coming");
	 }
	 
	public static void main(String args[])
	{
		
		ComplexReturntype ob= new ComplexReturntype();
		ob.showroom().fOne().fTwo().fThree().fFour().end();;
	}

}

