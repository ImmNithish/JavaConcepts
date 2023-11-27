package Constructor;

public class ConstructorEx {

		int iRollNo = 10;
		String name = "Mathan";
		
		public ConstructorEx() {
			System.out.println("This is a Default Constructor");
		}
		
		public ConstructorEx(int i,String s) {
			iRollNo = i;
			name = s;
		}
		
		public void print() {
			System.out.println("Roll No is : "+iRollNo);
			System.out.println("Name is : "+name);
		}
		//To Debug step by step we have to press f6
		//To switch from one debug point to another debug point we have to press f8

		public static void main(String[] args) {
			//ConstructorEx obj1 = new ConstructorEx(); // Creating an Object
			//obj1.print(); // 10,Mathan
			ConstructorEx obj2 = new ConstructorEx(100,"Ramesh");
			obj2.print(); // 100, Ramesh
			
		}

	}

