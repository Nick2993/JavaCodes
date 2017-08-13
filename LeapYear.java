/**************************************************************************************************
* PURPOSE- Write a LeapYear.java program that takes a year as input and outputs the Year is
*a Leap Year or not a Leap Year.
*
* @author-Nikhilesh
*
* @version 1.7.0
*
* @since 13-08-2017
****************************************************************************************************/
import java.io.*;
class year
{
void display(int n)
{
	if(n%4==0 && n%100!=0)
	{
	System.out.println("Leap Year");
	}
		else if(n%400==0)
		{
		System.out.println("Leap Year");
		}
	else
	{
	System.out.println("Not a leap year");
	}
}
}

class LeapYear
{
	public static void main(String... args)
	{
		int n=Integer.parseInt(args[0]);
		year y=new year();
		y.display(n);
	}
}