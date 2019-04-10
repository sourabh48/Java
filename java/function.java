import java.io.*;
import java.util.*;

public class function
{
	public static void main(String args[])
	{
		DataInputStream dis = new DataInputStream(System.in);
		try
		{
			System.out.println("Enter value of a:");
			int a = Integer.parseInt(dis.readLine());
			System.out.println("Enter value of b:");
			int b = Integer.parseInt(dis.readLine());
			System.out.println("Enter value of c:");
			int c = Integer.parseInt(dis.readLine());
			
			Calculator cal = new Calculator();
			int d = cal.calculation(a,b,c);
			System.out.println(d);
 
		}
		catch(Exception e)
		{}
	}
}

class Calculator
{
	int calculation(int x,int y,int z)
	{
		int w = 0;
		if(x>=0 && y>=0)
		{
			if(z==1)
			{
				w =(x+y);
			}
			if(z==2)
			{
				if(x>y)
				{
					w = (x-y);
				}
				else
				{
					w= (y-x);
				}			
			}
			if(z==3)
			{
				w = (x*y);
			}
			if(z==4)
			{
				if(y != 0)
				{
					w = (x/y);
				}
			}
			if(z>4)
			{
				System.out.println("The number must be between 1 to 4");
			}			
		}
		else
		{
			System.out.println("a and b must be positive");
		}
		return w;
	}
}