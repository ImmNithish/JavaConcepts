package wrapperclass;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		Integer obj= new Integer(a); // boxing putting value as object
		//Integer bb=a;// auto boxing
		
		int b=obj.intValue(); // unboxing changing obj to primitive data type
		
		System.out.println(b);
		
		//int c=7;
		Integer ob= new Integer(7);
		System.out.print(ob.byteValue());
		System.out.print("-");
		
		
		/*  THIS SHOWS ERROR BCZ UNBOXING SYNTAX IS WRONG */
		//int i= new Integer(7);
		
		//System.out.println(i.byteValue(7));
	}

}
