import java.io.*;
public class arithexcep
{
	public static void main(String args[])
	{
		DataInputStream dis = new DataInputStream(System.in);
		{	
			int x=10,y,z;
			try
			{
				System.out.println("Enter a number");
				y=Integer.parseInt(dis.readLine());
				z=x/y;
				System.out.println("Result= "+z);
			}
			catch(IOException ie)
			{
				System.out.println(ie);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		System.out.println("HELLO CHUTIYA");
		}
	}
}