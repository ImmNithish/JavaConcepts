package incrementopereator;

public class eg3 {

	public static void main(String[] args) {
	int s=0,n=10;
	int c=0;
	//final int c=0;
	for(;n<50;n=n*5)
	{
		s=s+n;
		c++; //if final was declared i show error
				
	}
	System.out.println(s);
	}

}
