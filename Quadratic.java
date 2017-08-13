import java.util.*;
class Quadratic 
{
	public static void main(String... arhs)
	{
		Scanner sc=new Scanner(System.in);
		double x1,x2; 
		double a,b,c,del;
		System.out.println("Find the roots of equation\nEnter the value of a,b,c\n");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		del=(b*b)-(4*a*c);
		x1=(-b+Math.sqrt(del))/(2*a);
		x2=(-b-Math.sqrt(del))/(2*a);
		System.out.println("Root 1 of x = "+x1);
		System.out.println("\nRoot 2 of x = "+x2);
	}
}

