package Abstrcation;

	public class SBI extends RBIAbstract{
		
		
		public void mutualFund() {
			System.out.println("SBI is providing Mutual Fund");
		}


		public static void main(String[] args) {
			SBI oSBI = new SBI();
			System.out.println("Home Loan % is : "+oSBI.homeLoan());
			System.out.println("Car Loan % is : "+oSBI.carLoan());
			System.out.println("Personal Loan % is : "+oSBI.personalLoan());
			System.out.println("Credit Card Loan % is : "+oSBI.creditCardLoan());
			oSBI.mutualFund();
			// we are creating a ref variable for parent class bcz we cant create obj for abstract class 
			
			RBIAbstract oRBI = new SBI();
			System.out.println("Home Loan % is : "+oRBI.homeLoan());
			System.out.println("Car Loan % is : "+oRBI.carLoan());
			System.out.println("Personal Loan % is : "+oRBI.personalLoan());
			System.out.println("Credit Card Loan % is : "+oRBI.creditCardLoan());
		}

		@Override
		public double creditCardLoan() {
			
			return 11.5;
		}
		
		
	}


