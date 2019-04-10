package division;
import java.io.*;
public class division
{	
	int x=0,sum=0,i=0;
	
	public int div()
	{
		DataInputStream dis= new DataInputStream(System.in);
		try
		{		
			
			System.out.println("Enter the number of numbers you want to calculate: ");
			int n=Integer.parseInt(dis.readLine());
			int x[]=new int[n];
			for(int i=0;i<=n;i++)
			{	
				System.out.println("Enter first number: ");
				 x[i]= Integer.parseInt(dis.readLine());
				sum=sum/x[i];
			}
		  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return (sum);	
	}	
} 