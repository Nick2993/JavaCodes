import java.util.*;
class CarLoan
{
	public static void main(String... ar)
	{
		int p=Integer.parseInt(ar[0]);
		int y=Integer.parseInt(ar[1]);
		int r=Integer.parseInt(ar[2]);
		double k=r/(12*100);
		int n=12*y;
		double payment=p*k/1-(Math.pow((1+k),-n));
		System.out.println("Payment = "+payment);
	}

}