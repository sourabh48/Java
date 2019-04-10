package addition;
import java.io.*;
public class addition
{	
	int sum=0,i=0;
	
	public int add()
	{

		DataInputStream dis= new DataInputStream(System.in);
		try
		{		
			
			System.out.println("Enter the number of numbers you want to calculate: ");
			int n=Integer.parseInt(dis.readLine());
			int x[]=new int[n];
			for(int i=1;i<=n;i++)
			{	
				System.out.println("Enter a number: ");
				 x[i]= Integer.parseInt(dis.readLine());
				 sum=sum+x[i];
			}
			
		  
		}
		catch(Exception e)
		{}
		return (sum);	
	}	
} 