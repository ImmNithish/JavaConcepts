package day01;

public class AsTwo {
	
	String name= "hai"; // instance variable 
	static int bring=100;  // static variable
	
public static void main(String args[]) {
	String name1= "gud day";	// local variable 
	int a=14;
	System.out.println("string name1:"+name1);// local varaible calling
	System.out.println(" the value is:" +a);
	
	
	AsTwo o=new AsTwo(); // object calling 

	System.out.println(" the value is:" +o.name); // Global variable calling  
	
	System.out.println(" the value is static value:" +bring);// calling static value
}

}
