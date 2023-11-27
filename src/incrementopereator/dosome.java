package incrementopereator;

class sum {
	int m1(int n) {
		int r= m1(n-1);
		return r;
	}
}

public class dosome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
			sum obj=new sum();
			System.out.println(obj.m1(5));
	}

}
