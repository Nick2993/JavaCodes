import java.util.*;
class WindChill
{
	public static void main(String... aa)
	{
		
		int t=Integer.parseInt(aa[0]);
		int v=Integer.parseInt(aa[1]);
		double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
		System.out.println("ans"+w);	
	}	
}