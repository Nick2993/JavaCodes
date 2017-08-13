import java.util.*;
class Prime
{
	public static void main(String... aa)
	{
		int j,n;
		int i=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range to find prime ");
		n=sc.nextInt();

		int count;
		System.out.println("Prime no are");

		

		for(i=1;i<=n;i++)
		{
			count=0;

			if(i==1)
			{
			System.out.println("1");

			}
		
			for(j=1;j<=i;j++)
			{
				if(i % j == 0)
				{
					count++;
				}
			}

			if(count==2)
			{
				System.out.println(""+i);
			}
			
		}
				
		
		
	}
}