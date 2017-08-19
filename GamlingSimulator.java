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
//import java.io.*;
import java.util.Scanner;
class Gamling
{
    
    int i,rand,t=0;
void display(int stake,int goal,int trials)
{
    
for(i=0;i<=trials;i++)
{
 rand= (int)(1+(Math.random()*stake));
 if(rand>stake/2)
 {
     stake++;
     
 }


if (stake==goal)
{
    System.out.println("Congratulation!!!! You won!!! After" +i+"trails");
    
    i=trials;
}
if(trials==i)
{
    System.out.println("You loss ");
    
    
}
}
}
}

    
class GamlingSimulation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the STAKE");
        int s=sc.nextInt();
        System.out.println("Enter GOAL");
        int g=sc.nextInt();
        System.out.println("Enter No. of TRAILS");
        int t=sc.nextInt();
        Gamling game=new Gamling();
        game.display(s,g,t);
        
        
    }
    }
