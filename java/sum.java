import java.io.*;
class sum
{ 
	public static void main(String args[])
	{
		DataInputStream dis= new DataInputStream(System.in);
		try
		{
			int t, x,rem,sum=0;
			System.out.println("Enter a number");
			x=Integer.parseInt(dis.readLine());
			t=x;
			while(t!=0)
			{
				rem=t%10;
				sum=sum+rem;
				t=t/10;
			}
			System.out.println(sum);
		}
	
		catch(Exception e)
		{}
	}
}