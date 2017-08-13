import java.util.*;
class Gamling 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many token u want to apply");
		int n=sc.nextInt();
		int a[]=new int[n];
		Random r=new Random();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			//a[i]=((int)Math.random()*6)+1;
			a[i]=r.nextInt(50);
			sum=sum+a[i];
		}
			
			System.out.println("Generated no are");
			for(int i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
			
			int win=0,loss=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]<sum/2)
			{
				loss++;
			}
			else
			{
				win++;
			}
		}
		System.out.println("Win percentage is:"+(win*100)/n);	
		System.out.println("lose percentage is:"+(loss*100)/n);
		
	}

}