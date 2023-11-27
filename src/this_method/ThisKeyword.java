package this_method;

public class ThisKeyword {
	
	int iRollNo = 10;
	String name = "Mathan";
	
	public ThisKeyword(int iRollNo,String name) {
		this.iRollNo = iRollNo;
		this.name = name;
	}
	
	public void print() {
		System.out.println("Roll No is : "+iRollNo);
		System.out.println("Name is : "+name);
	}
	
	public void display() {// this method eg 
		//print();
		this.print();
		System.out.println("This is Display method");
	}

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword(200,"Nithish");
		obj.display();

}}
