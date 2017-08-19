import java.util.*;
class RollDice
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("How many times u want roll dice");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=rand.nextInt(6);
		}
		System.out.println("DICE generated no are");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		
int b[]=new int[9];
		b[0]=a[0];
		for(int i=1;i<n;i++)
		{
			for(int j=0;i<=i;j++)
			{
			if(a[i]!=b[j])
			{
				
				b[j]=a[i];
			}
			}
		}
		
		System.out.println("Distinct values are");
		for(int k=0;k<=b.length;k++)
		{
		System.out.println(b[k]);
		}
	}

}
