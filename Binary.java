/**************************************************************************************************
* PURPOSE- Write a program Binary.java prints the binary (base 2) representation of the decimal
*number typed as the command­line argument.
*
* @author-Nikhilesh
*
* @version 1.7.0
*
* @since 13-08-2017
****************************************************************************************************/
import java.io.*;

class Bin1
{
String x=" "; 
   void Display(int n)
   {
           while(n>0)            //checking whether n is greter than 1 or not
            {
             int a=n%2;
             x=a+" "+x;
             n=n/2;
             }
     System.out.println("Decimal of"+n+"is:"+x);
    }
}
class Binary
{
public static void main(String... args)
               {
                int n=Integer.parseInt(args[0]); //Taking decimal value from user through Command-Line agrument
                Bin1 b =new Bin1(); //create a class object
                b.Display(n); //calling a method
               }
}



