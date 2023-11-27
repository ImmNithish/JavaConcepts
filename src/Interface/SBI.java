package Interface;

	public class SBI implements RBIInterface{
		
		public double homeLoan() {
			return 6.5;
		}
		
		public double carLoan() {
			return 8.8;
		}
		
		public double personalLoan() {
			return 8.2;
		}
		
		public double creditCardLoan() {
			return 12.5;
		}
		
//		public void landLoan() {
//			System.out.println("SBI Land loan % is : "+4.4);
//		}

		public static void main(String[] args) {
//			SBI oSBI = new SBI();
//			System.out.println("Home Loan % is : "+oSBI.homeLoan());
//			System.out.println("Car Loan % is : "+oSBI.carLoan());
//			System.out.println("Personal Loan % is : "+oSBI.personalLoan());
//			System.out.println("Credit Card Loan % is : "+oSBI.creditCardLoan());
//			oSBI.landLoan();
//			
			RBIInterface oRef = new SBI();
			System.out.println("Home Loan % is : "+oRef.homeLoan());
			System.out.println("Car Loan % is : "+oRef.carLoan());
			System.out.println("Personal Loan % is : "+oRef.personalLoan());
			System.out.println("Credit Card Loan % is : "+oRef.creditCardLoan());
			oRef.landLoan();
		}

	}


