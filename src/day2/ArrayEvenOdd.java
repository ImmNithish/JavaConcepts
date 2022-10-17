package day2;

public class ArrayEvenOdd {
static public void main(String args[])
	
{
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	System.out.println(" even number are");
	for( int i=0; i< a.length ;i++) {
	
	
	if(a[i]%2==0)
	{
		System.out.println(a[i]);
	
	}}
	
	System.out.println(" odd number are");
	for( int i=0; i<a.length;i++)
	{
	
	
	if(a[i]%2!=0)
			
	{
		System.out.println(a[i]);
	
	}
	}
	}}

