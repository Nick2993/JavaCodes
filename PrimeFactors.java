/*********************************************************************
* Purpose: A program to compute Factors of a number N using prime factorization
*method.
* @author   Nikhilesh
* @version  7.0
* @since    15-08-2017
************************************************************************/
import java.util.Scanner;
public class PrimeFactors 
{
	public static boolean isPrime(int i)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
	     		return false;
	    	}
	  	}
	 	return true;
	 }

	public static void main(String[] args) 
	{ 
                Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. to find PrimeFactors:");
		int n=sc.nextInt();
		System.out.println();
		System.out.println("The prime factors for the "+n+" is:");
		System.out.println();
		   
		for(int i=2;i*i<=n;i++)
		{  
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
        System.out.println();
	}
}
