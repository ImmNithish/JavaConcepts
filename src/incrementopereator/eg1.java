package incrementopereator;

public class eg1 {

public static void main(String args[]){
	int m=12,n=4,res=0;

	
	if((m-n)<25)
	{
		res= ++m+n++;
	System.out.println(" 1 :" +res);
	}
	else {
			res=--n+m+n++;
			System.out.println(" 2 :" +res);
		}
	System.out.println(res);
	}

}
