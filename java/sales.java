import java.io.*;
class sales
{
	public static void main(String args[])
	{
		int i=0 , sum=0, avg=0;
		int a[]=new int[5];
		 
		DataInputStream dis=new DataInputStream(System.in);
		try
		{
			for (i=0;i<5;i++)
			{
				System.out.println("\n Input month "+(i+1)+" sale\n");
				a[i]=Integer.parseInt(dis.readLine());
			}	
			
			System.out.println("\n\n The required sales of the Respective 5 months are.... ");
			
			for(i=0;i<5;i++)
			{
				System.out.println("\n"+(i+1)+"st month sale is: "+a[i]);
				sum = sum+ a[i];	
			}
			avg= sum/5;
			System.out.println("\nSum of sales+"+sum);
			System.out.println("\nAvarage sale="+avg);
		}
		catch(Exception e)
		{}
	}
}