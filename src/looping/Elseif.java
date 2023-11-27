package looping;

import java.util.Scanner;

public class Elseif {
public static void main(String args[]) {
	int amount;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the amount:");
	amount= in.nextInt();
			
	if(amount==60) {
		System.out.println(" you have bookfed unreserverd class:");
	}
	
	else if (amount>=200 && amount<=300 )
	{
		System.out.println(" you have booked sleeper class");
	}
	else if (amount>=500 && amount<=700)
	{
		System.out.println(" you have booked 1st class");
	}
	else if (amount>=900 && amount<=1200)
	{
		System.out.println(" you have booked 1st class AC");

	}
	else {
		System.out.println("enter valid amount");
}
}
}
