package day01;

import java.util.Scanner;

public class Assthree {
	public static void main(String args[])

	{
		int a=5, b= 2,c = 3;
		c++;
		
		System.out.println("the value is :"+(++a)*(++a));
		System.out.println("the value is :"+(++b)*(b++));
		System.out.println("the value is:" +c );
	
		System.out.println("the value is:" +(c--) );
	System.out.println("*************************");
	
	int marks;
	Scanner in= new Scanner(System.in);
	System.out.println("enter marks:");
	 marks=in.nextInt();
			

	if(marks >=35 && marks<=100)
	{
		
		System.out.println(" your are passed");
	}
	else
	{
		System.out.println(" you are failed");
	}
		
		
	}
	
			
}
