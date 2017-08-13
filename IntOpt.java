import java.util.*;
class IntOpt
{
	public static void main(String... ah)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a,b,c\n");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(a+b*c);
		System.out.println(a*b+c);
		System.out.println(c+a/b);
		System.out.println(a%b+c);
	}
}