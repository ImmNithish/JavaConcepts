package ClassObject;

public class Sample {


public void sum() {
	int a=10,b=20,c;
	c = a + b;
	System.out.println("Sum is : "+c);
}
// We have 2 arguments for this methods
public void add(int a,int b) {
	int c = a + b;
	System.out.println("Sum is : "+c);
}

public void loginToGmail() {
	String uName = "mathan@gmail.com";
	String pw = "testing123";
	System.out.println("User Enters user name as "+uName+" and password as "+pw+" and click on login button");
}

public int bookTicket() {
	int iTicket = 2030;
	System.out.println("Ticket Booking number is : "+iTicket);
	return iTicket;
}

public void cancelTicket(int ticketNo) {
	System.out.println("Ticket "+ticketNo+ " is Cancelled");
}

public void orderFood(int ticketNumber) {
	System.out.println("Food is delivered for : "+ticketNumber);
}

public static void main(String[] args) {
	Sample oSum = new Sample();
	oSum.sum();
	oSum.loginToGmail();
	oSum.add(100,50);
	int ticket_num = oSum.bookTicket();
	oSum.cancelTicket(ticket_num);
	oSum.orderFood(ticket_num);
}

}
