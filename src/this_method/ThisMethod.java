package this_method;

public class ThisMethod {
		int iRollNo = 10;
		String name = "Mathan";
		
		public ThisMethod() {
			this(15);
			System.out.println("This is Default constructor");
		}
		
		public ThisMethod(int i) {
			this(200,"Karthick");
			System.out.println("This is one parameterized constructor : "+i);
		}

		public ThisMethod(int i,String s) {
			System.out.println("This is two parameterized constructor : "+i+" Name is "+s);
		}
		
		public static void main(String[] args) {
			
			ThisMethod obj1 = new ThisMethod(); // 2 Global Variable
			//ThisMethod obj2 = new ThisMethod(100,"nithish"); // 2 Global Variable
			
		}

	}
