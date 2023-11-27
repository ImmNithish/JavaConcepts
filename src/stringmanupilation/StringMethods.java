package stringmanupilation;

public class StringMethods {
	
	// String is a Inbuild Class or Non-Premitive DataType

	public static void main(String[] args) {
		String s1 = "Credo";
		String s2 = "CREDO";
		String s3 = "Credo Systemz ";
		String s4 = "Credo";
		String s5 = new String("Credo");
		System.out.println("Equal Method : "+s1.equals(s2));// false
		System.out.println("Equal Method : "+s1.equals(s3));// false
		System.out.println("Equal Method : "+s1.equals(s4));// true
		System.out.println("******"+(s1==s5));//false
		System.out.println("Equal Ignore Case method : "+s1.equalsIgnoreCase(s2));//true
		
		System.out.println("Equal Operator : "+(s1==s2)); // false
		System.out.println("Equal Operator : "+(s1==s4)); // true
		
		System.out.println("Compare Method : "+s2.compareTo(s1)); //32
		System.out.println("Compare Method : "+s1.compareTo(s4)); //0
		
		System.out.println("Length of the string : "+s1.length());
		System.out.println("To LowerCase : "+s2.toLowerCase());
		System.out.println("To UpperCase : "+s1.toUpperCase());
		
		System.out.println("Trim Method :"+s3.trim());
		System.out.println("Sub String : "+s1.substring(2));
		System.out.println("Sub String : "+s3.substring(6));
		System.out.println("Sub String : "+s3.substring(6,9));
		System.out.println("Sub String : "+s2.substring(2,4));
		
		System.out.println("Contains Method : "+s3.contains("Sys"));
		// String Class is Immutable --> Java will not allow to change the existing values stored in Ref variable.
		System.out.println("To UpperCase : "+s1.toUpperCase());
		System.out.println(s1); 
		System.out.println("*********");
		s1.toUpperCase();
		System.out.println(s1); 
		char[] letters = s1.toCharArray();
		for (char letter : letters) {
			System.out.println(letter);
		}
		System.out.println("Starts With method : "+s1.startsWith("C"));
		System.out.println("Ends With method : "+s1.endsWith("z"));
		
		System.out.println("Index Of Method : "+s1.indexOf("e"));
		System.out.println("IsEmpty : "+s1.isEmpty());
		//System.out.println("IsBlank : "+s1.isBlank();
		String course = "This is Java Session";
		System.out.println("Replace Charcter : "+s1.replace('d', 'D'));
		System.out.println("Replace Character Sequence : "+course.replace("Java", "Selenium"));
		System.out.println("Replace Character Sequence : "+course.replace("Java", ""));
		String price = "TShirt Price is 499 CAD25546";
		System.out.println("Replace with Regular expression : "+price.replaceAll("[a-zA-Z]", "").trim());
		System.out.println("Replace with Regular expression : "+price.replaceAll("[0-9]", "").trim());
		System.out.println("Replace with Regular expression : "+price.replaceAll("[a-zA-Z$]", "").trim());
		System.out.println("Replace with Regular expression : "+price.replaceAll("[^0-9]", "").trim());
		
		String date = "07-07-2022";
		String year[] = date.split("-");
		for (String d : year) {
			System.out.println(d);
		}// return type of string is array of string so we going for loop 
		System.out.println(year[2]);
		String name = "results for";
		String[] splitChar = name.split("");// it splits by charcters
		
		for (String split : splitChar) {
			System.out.println(split);
		}
	
	}

}
