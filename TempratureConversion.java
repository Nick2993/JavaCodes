/**************************************************************************************************
* COMPILATION- TempratureConversion.java
* EXECUTION- java TempratureConversion
*
* PURPOSE- Write a TemperaturConversion.java program, given the temperature in fahrenheit
* as input outputs the temperature in Celsius or viceversa
* @author-Nikhilesh
* @version 1.7.0
* @since 13-08-2017
*
****************************************************************************************************/
import java.io.*;
import java.util.*;
class TempratureConversion
{
public static void main(String args[])
{


int ch;
Scanner sc=new Scanner(System.in);
System.out.println("Choose your option");
System.out.println("1. Fahrenheit to celsius");
System.out.println("2.Celsius toFahrenheit ");
System.out.println("3.Exit");

ch=sc.nextInt();
switch(ch)
{
case 1:
{
System.out.println("Enter Fahrenheit");
float f=sc.nextFloat();
float c=0;
c=(f-32)*5/9;
System.out.println(c);
break;
}

case 2:
{
System.out.println("Enter Celcius");
float c=sc.nextFloat();
float f=0;
f=(c*9/5)+32;
System.out.println(f);
break;
}
case 3:
{
break;
}
}
}
}