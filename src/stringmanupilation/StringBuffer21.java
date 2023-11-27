package stringmanupilation;

public class StringBuffer21 {

	/* String, String buffer both are from same java.lang package
	 * where String is immutable we cant change or  replace the string ....
	 * it will always create new objects ... we do change the string value by change reference value
	 * 
	 * String buffer is mutable 
	 * we can change the value 
	 * 
	 * */
	public static void main(String args[])
	{
	
		
		String s1="hello";
		s1.concat("world");
		System.out.println(s1); // hello since it is immutable 
		
		  s1=s1.concat("people").concat(" out").concat(" there");

		
		System.out.println(s1);
		
		
		StringBuilder buf = new StringBuilder("ImNithish");
		buf.append("kumar");
		System.out.println("stingbuffer :" +buf);
		
		
	
		StringBuilder s5 = new StringBuilder("Automation selenium");
		String s6="Testing";
		System.out.println(s5.append(s6));
		System.out.println(s5.substring(5));
		int found= s5.indexOf(s6);//based on index number it star print  
	System.out.println(found);
	 
		StringBuffer  st=new StringBuffer("Webdriver");
		StringBuffer st2=st.reverse();
		System.out.println(st2);//revirdbeW
	
 String a= "data";//4
	 String b ="flow";//4
	 a=a+b;//dataflow = 8
	 b=a.substring(0,a.length()-b.length());//4
	 a=a.substring(b.length());
	 System.out.println(a+b);
	 
	 
	 try {
		 char[] charr= {};
		 System.out.println(charr[0]);
				 
	 }
	 catch(RuntimeException e) {
		 System.out.println("Exception occured");
	 }
	 
	}
	}

