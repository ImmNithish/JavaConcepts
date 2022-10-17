package day5;

public class Constructor {
	
		
		int iRollNo = 10;
		String name = "Mathan";
		
		public Constructor() {
			System.out.println("This is a Default Constructor");
		}
		
		public Constructor(int i,String s) {
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
			 // 10,Mathan
			Constructor obj2 = new Constructor(100,"Ramesh");
			obj2.print(); // 100, Ramesh
			Constructor obj1 = new Constructor(); // Creating an Object
			obj1.print();
			
		}


}
