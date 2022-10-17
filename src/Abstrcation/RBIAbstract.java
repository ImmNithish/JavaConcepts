package Abstrcation;

	public abstract class RBIAbstract {
		
		public RBIAbstract() {
			System.out.println("RBI Default Constructor"); // we can create a conctructor for a abstract class
		}
		
		public double homeLoan() {
			return 6.5;
		}
		
		public double carLoan() {
			return 8.8;
		}
		
		public double personalLoan() {
			return 8.2;
		}
		
		public  abstract double creditCardLoan(); // abstract method since it doesn't have any definition
		
		

	}



