import java.io.*;
public Class tagging
{
	public static void main(String args[])
	{	
		int x=0,y=0,z=0;
		DataInputStream dis=DataInputStream(System.in);
		try
		{
	looper:		System.out.println("Enter numerator");
			x=Integer.parseInt(dis.readLine());
			System.out.println("Enter denominator");
			y=Integer.parseInt(dis.readLine());
			z=x/y;
		}		
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("TRY AGAIN!!!!");
			return looper;
		}
	}
}