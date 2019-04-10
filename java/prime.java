import java.io.*;
public class prime
{
	
	public static void main(String args[])
	{
		int x=0,count=0;
		DataInputStream dis= new DataInputStream(System.in);
		try
		{
			System.out.println("Enter a number");
			x=Integer.parseInt(dis.readLine());
		}
		catch(Exception e)
		{}
		
		for(int i=2;i<=x/2;i++)
		{		
			if(x%i==0)
			{
				count=count+1;	
			}
			else
			{
				count=0;
			}
		}
		
		if(count==1)
		{
			System.out.println(" not Prime");
		}
		else
		{
			System.out.println(" Prime");
		}
	}
}
