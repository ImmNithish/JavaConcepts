package Inheritance;

public class CredoSystemz {
	
	String branch;
	String address;
	long mobile;
	String name;
	
	public CredoSystemz(int i) {
		System.out.println("All the Institute should follow the same standard");
	}
	
	public void totalRooms(int room) {
		System.out.println("All the branch should have atleast : "+room);
	}
	
	public void instituteDetails() {
		System.out.println("Name is : "+name);
		System.out.println("Branch is : "+branch);
		System.out.println("Address is : "+address);
		System.out.println("Mobile is : "+mobile);
	}}
	

