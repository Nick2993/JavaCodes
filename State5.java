import java.util.*;
class State5
{
	public static void main(String ar[])
	{
		double a[]=new double[5];
		for(int i=0;i<5;i++)
		{
			a[i]=Math.random();
		}
		
		System.out.println("Array is");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);		}
	
		}

		System.out.println("Average is "+Math.Avg(a));
		//System.out.println("Max is "+(Math.max(a)));
		//System.out.println("Min is "+(Math.min(a)));
 
}