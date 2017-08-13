/**************************************************************************************************
* Write a Program GamlingSimulator.java where a gambler starts with certain stake
in INR and places fair Re 1 bet until he/she goes broke or reaches the goal set as
input. Keeps track of the number of times won and number of bets made. Run the
simulation N times.
*
* @author-Nikhilesh
* @version 1.7.0
* @since 13-08-2017
*
****************************************************************************************************/
import java.io.*;
import java.util.*;
import java.math.*;
class bet
{
    int counter1=0,counter2=0;
    int more=0;
    Scanner sc=new Scanner(System.in);

     public void Display(int n)

{
	System.out.println(" How much stack you want to spend on game?");
	int m= sc.nextInt();
	int nm=n-m;
	int a[]= new int[n];
        System.out.println("Your Result is");
	      for(int i=0;i<m;i++)
	  {
 		a[i]=1+(int)(Math.random()*m);
              if(a[i]>m/2)
                {

                System.out.println("win");
                }
              else
                {

                System.out.println("loss");
                }
	  }
	for(int j=0;j<m;j++)
	{
		if(a[j]>m/2)
		{
		nm+=1;
		counter1++;
		}
			else
			{
			n-=1;
			counter2++;
			}
	}
                                                                                          System.out.println("Total winnings is:"+counter1);
                                                                                          System.out.println("Total loss is:"+counter2);
					                                                  System.out.println("Total remaining stack is:"+nm);

                                                     System.out.println("press one if you want to play one more game?");
                                                     more=sc.nextInt();
                                                                                        if(more==1)
                                                                                         {  
                                                                                           Display(n);
                                                                                          }
                                                                                         else
					                                                  {
                                                                                          System.out.println("Total winnings is:"+counter1);
                                                                                          System.out.println("Total loss is:"+counter2);
					                                                  System.out.println("Total remaining stack is:"+nm);				
                                                                                         

                                                                                         }



}
}

class GamlingSimulator
{
            public static void main(String... args)
           {
            Scanner sc=new Scanner(System.in);
            System.out.println( " Enter how much stack do you have??? ");
	    int n=sc.nextInt();
            bet b=new bet();
            b.Display(n);
            }
}