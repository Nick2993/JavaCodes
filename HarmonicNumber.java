import java.util.*;
class HarmonicNumber
{
	public static void main(String... aa)
	{
		int k=Integer.parseInt(aa[0]);
		double sum=0;
		for(int i=1;i<k;i++)
		{
			sum=sum+Math.pow(i,-1);
		
		}
			System.out.println(sum);
	}
}