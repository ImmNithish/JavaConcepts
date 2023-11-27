package ClassObject;

public class Demo {
	
	String name;
	long accountno;
	String address;
	long mobile;
	String email;
	String branchLocation;
	long mainbalance;
	
	public void welcome()
	{
		System.out.println("********welcome to SBI*******");
		System.out.println("");
	}
	public void details() {
		System.out.println("1.your name:" + name);
		System.out.println("2.your account number :" + accountno);
		System.out.println("3.your address:"+address);
		System.out.println("4.your mobile number:" +mobile);
		System.out.println("5.your emailid:"+email);
		System.out.println("6.your branch location:"+branchLocation);
	}
	
	public void deposit() {
		System.out.println("7.your current balance is:"+mainbalance);
	}
	
	//public void withdraw() {
		//int mainbalance =
		//System.out.println("8.your current balance is after withdraw is:" +mainbalance);
	//}
	
	public void atm() {
		System.out.println("9.you are eligible for atm card");
	}
	
	public static void main(String[] args) {
		Demo sbi = new Demo();
		sbi.name="Nithish";
		sbi.accountno= 00316005;
		sbi.address="bharathi nagar kovilpati";
		sbi.mobile= 77086715;
		sbi.email= "nithikr81@gamil.com";
		sbi.branchLocation = "kovilpatti";
		sbi.mainbalance= 15000;
		sbi.welcome();
		sbi.details();
		sbi.deposit();
		//sbi.withdraw();
		sbi.atm();
	}
		
	
	}
