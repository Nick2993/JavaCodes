/**************************************************************************************************
* COMPILATION- javac DayOfWeek.java
* EXECUTION- java DayOfWeek
*
* PURPOSE- TO Write a program DayOfWeek.java that takes a date as input and prints the day of
the week that date falls on. Your program should take three command­line
arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February,
and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth.
*
* @author-Nikhilesh
* @version 1.7.0
* @since 13-08-2017
*
****************************************************************************************************/

import java.io.*;

class cal
{
public void Display(int m,int d,int y)
{
int y0,d0,m0,x;
// TAKING THREE COMMAND-LINE ARGUMENTS FROM THE USER FOR DATE MONTH AND YEAR

y0=y-(14-m)/12;
x=y0+y0/4/100+y0/400;
m0=m+12*((14-m)/12)-2;
d0=(d+x+31*m0/12)%7;
//System.out.println(d0);

String aa[]={"Sunday","monday","tuesday","wednesday","Thursday","Friday","Saturday"};
System.out.println(aa[d0]);
}
}



class DayOfWeek
{
public static void main(String... args)
{

int m=Integer.parseInt(args[0]);
int d=Integer.parseInt(args[1]);
int y=Integer.parseInt(args[2]);
cal c=new cal();
c.Display(m,d,y);
}
}