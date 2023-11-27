package Interface;

public interface RBIInterface {

		
		String instituteName = "Credo Systemz";
		
		public double homeLoan();
		
		public double carLoan();
		
		public double personalLoan();
		
		public abstract double creditCardLoan();
		
		public default void landLoan() {
			System.out.println("Load Loan is depends on Implementation class");
		}


	}



