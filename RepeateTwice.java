import java.util.*;
class RepeateTwice
{
	public static void main(String args[])
	{
		int a[]={1,2,3,3,2,1,2,1,6,7,8};
		System.out.println("no. Repeated twice are");
		int count;
			
		for(int i=0;i<a.length;i++)
		{
			count=0;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count == 2)
			{
			System.out.println(a[i]);
			}
		}
	}
}