package Inheritance;

public class CredoVelacherry extends CredoSystemz{
	
	public CredoVelacherry() {
		// super() will invoke the corresponding constructor from the parent class .
		// Compiler will insert the default super() when it encounter the keyword called extends .
		// super() should only be invoked in the constructor and it should in the 1st line of constructor .
		super(10); 
		System.out.println("Credo Velacherry will be following defined standard");
	}
	
	public void totalRooms(int room) {
		System.out.println("Total Rooms are : "+room);
	}
	
	public void parentMethod() {
		super.totalRooms(6);
	}

	public static void main(String[] args) {
		
		CredoVelacherry vel = new CredoVelacherry();
		vel.name = "Credo Systemz";
		vel.branch = "Velacherry";
		vel.address = "Rajalakshmi Street,Velacherry";
		vel.mobile = 9874563215l;
		vel.instituteDetails();
		vel.totalRooms(12);
		vel.parentMethod();
		
		CredoVelacherry omr = new CredoVelacherry();
		omr.name = "Credo Systemz";
		omr.branch = "OMR";
		omr.address = "Jeva Nagar,thoraipakkam";
		omr.mobile = 1235489555l;
		omr.instituteDetails();
		omr.totalRooms(8);
		
	}

}



