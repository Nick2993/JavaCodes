import java.util.*;
import java.math.*;
class SumOfTwoDice
{
	public static void main(String... ar)
	{
		Random random=new Random();
		int a=random.nextInt(6);
		
		int b=random.nextInt(6);
		
		System.out.println("Sum of two dice is ="+(a+b));
	}
}