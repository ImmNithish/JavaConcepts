package optionalargument;



public class OptionalArgument {
	
		
		public void bookTicket(int adultTicketCount,int ...childCount) {
			System.out.println("Total Adult Ticket is : "+adultTicketCount);
			if(childCount.length > 0) {
				for(int i=0;i<childCount.length;i++) {
					System.out.println("Child is : "+childCount[i]);
				}
			}else {
				System.out.println("No Child as of now.");
			}
		}
		
		public static void  passengerName(String ...name) {
		//	return name;
			for(String s:name)
				System.out.println("Passenger Name is :"+s);
			System.out.println();
		}
	

		public static void main(String[] args) {
			OptionalArgument obj = new OptionalArgument();
//			obj.bookTicket(2);
//			obj.bookTicket(2,1);
//			obj.bookTicket(2,1,1);
//			obj.bookTicket(2,1,2,4,5,14,31);
			
			passengerName("credo");
			passengerName("credo","karthi");
			passengerName("credo","karthi","Reeva");
			
			passengerName("credo","karthi","nithish","Reeva");
			
		}

	}



