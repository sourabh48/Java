import java.io.*;
class information
{
	int n=0,m=0,i=0,j=0;
	int stud[][]=new int[n][m];
	int sum[]=new int[n];
	void info()
	{

		DataInputStream dis= new DataInputStream(System.in);
		try
		{
			System.out.println("ENTER THE NUMBER OF STUDENTS IN YOUR CLASS: \n");
			n=Integer.parseInt(dis.readLine());
			System.out.println("ENTER THE NUMBER OF SUBJECTS: \n");
			m=Integer.parseInt(dis.readLine());
		}
		catch(Exception e)
		{}
		
		for( i=1;i<=n;i++)
		{
			for( j=1;j<=m;j++)
			{
				try
				{
					System.out.println("ENTER THE MARKS OF STUDENT OF ROLL NO:"+i+ "IN SUBJECT NO:"+j);
					stud[i][j]=Integer.parseInt(dis.readLine());
				}
				catch(Exception e)
				{}
			}
		
		}
	}
	void netmarks()
		
	{
	        
	
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=m;j++)
			{
				sum[i]=sum[i]+stud[n][m];
			}
		}
	}
	void output()
	{
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=m;j++)
			{
				System.out.println("ENTER THE MARKS OF STUDENT OF ROLL NO:"+i+ "GOT"+sum[i]+"IN TOTAL");	
			}
		}
	}
}
public class student
{
	public static void main(String args[])
	{
		information f=new information();
		f.info();
		f.netmarks();
		
		f.output();
	}
} 