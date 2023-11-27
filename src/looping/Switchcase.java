package looping;

import java.util.Scanner;

public class Switchcase {
public static void main(String args[])
{
String day;
System.out.println("Select  a day b/w 1. monday 2. tuesday 3. wednesday 4.thursday 5.friday 6.saturday 7.sunday");
/*System.out.println("1.Monday");
System.out.println("2.Tuesday");
System.out.println("3.wednesday");
System.out.println("4.Thursday");
System.out.println("5.friday");
System.out.println("6.thursday");
System.out.println("7.sunday");
System.out.println("entr which day ypu want:");*/
Scanner s=new Scanner(System.in);
day=s.nextLine();
int i=0;
i++;
switch(day)
{
case "monday":
	System.out.println(" the value for day  is 0");
	break;
case "tuesday":
	System.out.println(" the value for day  is 1" );
	break;
case "wednesday":
	System.out.println(" the value for day  is 2" );
	break;
case "thursday":
	System.out.println(" the value for day  is 3");
	break;
case "friday":
	System.out.println(" the value for day  is 4");
	break;
case "saturday":
	System.out.println(" the value for day  is 5");
	break;
case "sunday":
	System.out.println(" the value for day  is 6");
	break;

default:
	System.out.println(" enter valid day");

}}}