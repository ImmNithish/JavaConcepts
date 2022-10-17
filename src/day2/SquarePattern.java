package day2;

import java.util.Scanner;

public class SquarePattern {
	
		static public void main(String args[])
		{
			for(int i=0;i<5;i++)
				System.out.println("****");
			System.out.println("--------------using nested loop-------------");
			System.out.println(" enter the N:");		
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			System.out.println("enter whoch character you want:");
			char c=in.next().charAt(0);
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(c);
				}
			System.out.println();
			}
		}}
