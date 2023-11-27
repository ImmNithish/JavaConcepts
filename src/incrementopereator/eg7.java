package incrementopereator;

public class eg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int v1=20, v2=30,v;
//		System.out.println(~v1);
//		v=v1-v2;
//		System.out.println(v); // -(v+1) will give ans for  ~ v
//		System.out.println(~v);
////			
//		byte a=127;
//		a++;
//		a++;
		
		int x = 5,y=2;
		int a = ++y - y++ + ++y + ++x - x++;
		System.out.println(a);
		System.out.println(~a);
	
	}

}
