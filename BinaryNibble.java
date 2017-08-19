 
/*********************************************************************
* Purpose: Convert to Binary and perform the following functions.
	   i. Swap nibbles and find the new number.
	   ii. Find the resultant number is the number is a power of 2.

* @author   Nikhilesh
* @version  7.0
* @since    15-08-2017
************************************************************************/


class BinaryNibble
{


	public static  void main(String args[])
	{
		int b=Integer.parseInt(args[0]);
		binary q=new binary();
		q.DecimalToBinary(b);		
	}	

}

class binary
{
	//Instance variable

	int index,num;    			   	
	int c[]=new int[8];
	static int Two=2;
	
	//converting decimal to binary
	void DecimalToBinary(int a)			
	{
		int b[]=new int[8];
			
		
		while(a>0)
		{
			b[index]=a%2;
			a=a/2;
			index++;
		
		
		}
			System.out.println("Binary is:");
		

			int j=0;
		
		for(int i=7;i>=0;i--)
		{
			c[j]=b[i];
			System.out.print(c[j]);
			j++;
		}
		
		
			
		calc(c);		
	}
	

	//Swap the binary number

	void calc(int c[])
	{
		int temp=0;
	
		System.out.println();

		for(int j=0;j<4;j++)
		{
			temp=c[j];
			c[j]=c[4+j];	
			c[4+j]=temp;
			
				
		}
			System.out.println("\nAfter swaping binary no is:");
		for(int j=0;j<8;j++)
		{
			
			System.out.print(c[j]);
				
		}
		BinaryToDecimal(c);	
	}
	
	void BinaryToDecimal(int a[])
	{
		int sum=0,i=0;
		System.out.println();
		for(int j=7;j>=0;j--)
		{
			if(a[j]==1)
			{
				sum=sum+a[j]*(int)Math.pow(Two,i);
				i++;
			}
			else
			{

			i++;
			}
		}
		System.out.println("\nnew Decimal no is:");
		System.out.println(""+(sum));
	}
}
		


