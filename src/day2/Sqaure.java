package day2;

public class Sqaure {
	static public void main(String args[])
	
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<10;i++)
		{
		
		System.out.println("The square:"+a[i]*a[i]);
		
		}
		for(int i=0;i<10;i++)
		{
		sum= sum+a[i];
		}
		System.out.println("the sum of all number in array:" +sum);
	}}