import java.io.*;
public class multiexcep
{
	public static void main(String args[])
	{	
		try
		{
			int a[]=new int[5];
			a[5]=20/0;
		}	
		
		catch(ArrayIndexOutOfBoundsException be)
		{
			System.out.println(be);	
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}
} 