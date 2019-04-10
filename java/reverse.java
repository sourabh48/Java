import java.io.*;
class reverse
{ 
	public static void main(String args[])
	{
		DataInputStream dis= new DataInputStream(System.in);
		try
		{
			int  x,reverse=0;
			System.out.println("Enter a number");
			x=Integer.parseInt(dis.readLine());
			
			while(x!=0)
			{
			reverse=reverse*10;
			reverse=reverse+x%10;
			x=x/10;
			}
			System.out.println(reverse);
		}
	
		catch(Exception e)
		{}
	}
}