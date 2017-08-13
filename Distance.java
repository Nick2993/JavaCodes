import java.util.*;
import java.math.*;
class Distance
{
	public static void main(String... aa)
	{
		
		System.out.println("Enter x and y axis values\n");
		int a=Integer.parseInt(aa[0]);
		int b=Integer.parseInt(aa[1]);
		//int r=((Math.pow(a,2)+Math.pow(b,2));
		int r=a*a+b*b;
		System.out.println("Distance "+r);
	}
}