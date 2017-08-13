import java.util.*;
class DoubleOpt
{
	public static void main(String... ah)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a,b,c\n");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		System.out.println(a+b*c);
		System.out.println(a*b+c);
		System.out.println(c+a/b);
		System.out.println(a%b+c);
	}
}