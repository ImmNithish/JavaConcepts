package StaticMethod;

	public class StaticEx {
		
		int iRollNo;
		String name;
		static int iBatch = 2022;
		static int ipage=0;
		
		public StaticEx(int i,String s) {
			iRollNo = i;
			name = s;
			ipage++;
		}
		
		public void print() {
			System.out.println("Roll No is : " + iRollNo);
			System.out.println("Name is : " + name);
			System.out.println("Student Batch is : "+iBatch);
			System.out.println("Student Batch is : "+ipage);
			//static int i=10;
		}
		
		public static void dummy() {
			StaticEx obj3 = new StaticEx(102, "Ramesh");
			obj3.print(); // 102,Ramesh,2022
			System.out.println("This is a Static Dummy Method");
		}
		
		public static void dummy(int i) {
			StaticEx obj3 = new StaticEx(102, "Ramesh");
			obj3.print(); // 102,Ramesh,2022
			System.out.println("This is a Static Dummy Method");
		}
		
		static {
			System.out.println("This is a Static Block");
		}

		public static void main(String[] args) {
			//dummy();
			//StaticEx.dummy();
			//System.out.println("Student Batch is : "+iBatch); //2022
			StaticEx obj1 = new StaticEx(100,"Karthick");
			obj1.print(); // 100,Karthick,2022
			
			StaticEx obj2 = new StaticEx(101,"Reeva");
			obj2.print(); //101,Reeva,2022
			StaticEx obj3 = new StaticEx(102,"nithish");
			obj3.print();
			StaticEx obj4= new StaticEx(103,"navven");
			obj4.print();
		}

	}
