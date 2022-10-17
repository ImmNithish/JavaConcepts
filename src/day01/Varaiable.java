package day01;

public class Varaiable{ 

	int iRollNo = 1020;
	static int salary = 1000;
	
	public void print() {
		String instituteName = "Credo Systemz";
		int fees = 15000;
		int paidFees = 10000;
		System.out.println("I am mentor of : " + instituteName);
		System.out.println("Roll No is : "+iRollNo);
		System.out.println("My Salary is : "+salary);
		if(paidFees == fees) {
			boolean payment = false;
			System.out.println("Fees Payment is completed");
			System.out.println("Is Payment pending : "+payment);
		}else {
			System.out.println("Fees Payment is not completed fully!!!");
			//System.out.println("Is Payment pending : "+payment);
		}
	}
	// System Defined Method
	public static void main(String[] args) {
		
		// How to create an object for a class
		// Sy : className refName = new constructorcall();
		Varaiable var = new Varaiable(); // Creation of an Object for Variables Class
		int a = 10, b = 20, c;
		c = a + b;
		System.out.println("Sum of 2 numbers are : " + c);
		var.print();

	}

}
