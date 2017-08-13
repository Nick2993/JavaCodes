/**************************************************************************************************
* COMPILATION- TempratureConversion.java
* EXECUTION- java TempratureConversion
*
* PURPOSE- Write a program Trig.java to illustrate various trigonometric functions in the Math
*library, such as Math.sin(), Math.cos(), and Math.toRadians(). Firstly reads in an
*angle (in degrees), converts to radians, and then performs various trigonometric
*calculations.
* @author-Nikhilesh
* @version 1.7.0
* @since 13-08-2017
*
****************************************************************************************************/
import java.io.*;
import java.util.*;
class Trigno
{
public static void display()
{
int ch;
Scanner sc=new Scanner(System.in);
System.out.println("Choose your option");
System.out.println("1. Sin Conversion");
System.out.println("2. Cos conversion");
System.out.println("3. Degree to Radian Conversion");
ch=sc.nextInt();
switch(ch) 
{

	case 1:
	{
	System.out.println("Enter the Degree");
float a=sc.nextFloat();

System.out.println("The value is:"+Math.sin(a));
break;
}

case 2:
{
System.out.println("Enter the Degree");
float b=sc.nextFloat();

System.out.println("The value is:"+Math.cos(b));
break;
}  

case 3:
{
System.out.println("Enter the Degree");
float c=sc.nextFloat();

System.out.println("The value is:"+Math.toRadians(c));
break;
}
default:
{
break;
}
}
}
}
class Trig
{
public static void main(String... args)
{
Trigno t=new Trigno();
t.display();
}
}



