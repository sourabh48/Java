import java.io.*;
class student1
{
	public static void main(String args[])
	{
		int i=0,high=0,y=0,student=0;
		int stud[]=new int[5];
		
		DataInputStream dis= new DataInputStream(System.in);
		
		try
		{
			for (i=0;i<5;i++)
			{	System.out.println("\n Enter the marks of student of roll:"+(i+1));
				stud[i]=Integer.parseInt(dis.readLine());
			}
			for (i=0;i<5;i++)
			{
				if (y<=stud[i])
				{
					y=stud[i];
				        student=i+1;
				}
				
				
			}
			System.out.println("\n highest mark of student:"+(i+1)+ ":"+y);
			System.out.println("\n Topper is of roll no:"+student);
		}
		catch(Exception e)
		{}
	}
}
						