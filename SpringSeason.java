class SpringSeason
{
	public static void main(String args[])
	{
		int m=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		
		
			if(m==3 && m<=31 && m>=20)
			{
			System.out.println("True");
			}
			else if(m==4 && d<=30)
			{
			 System.out.println("True");
			}
			else if(m==5 && d<=31)
			{
				System.out.println("True");
			}
			else if(m==6 && d<=20)
			{
				System.out.println("False");
			}
		
		else
		{
			System.out.println("False");
		}	
	}
}