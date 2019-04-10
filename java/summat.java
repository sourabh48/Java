import java.io.*;
public class summat
{
	public static void main(String args[])
	{ 
		int row=0, column=0,i ,j;
		DataInputStream dis= new DataInputStream(System.in);
		{
			try
			{
				System.out.println("Enter the number of rows:");			
				row=Integer.parseInt(dis.readLine());
				System.out.println("Enter the number of columns:");			
				column=Integer.parseInt(dis.readLine());
				int a[][]=new int [row][column];
				int b[][]=new int [row][column];
				int c[][]=new int [row][column];
				System.out.println(" Enter first matrix");
				for(i=0;i<row;i++)
				{
					for( j=0;j<column;j++)
					{
					a[i][j]=Integer.parseInt(dis.readLine());
					}
				}
				System.out.println("\n Enter Second matrix");
				for(i=0;i<row;i++)
				{
					for(j=0;j<column;j++)
					{
						b[i][j]=Integer.parseInt(dis.readLine());
					}
				}
				for(i=0;i<row;i++)
				{
					for(j=0;j<column;j++)
					{
						c[i][j]=a[i][j]+b[i][j];     /*[addition]*/
						
						/*c[i][j]=a[i][j]-b[i][j];  [subtraction]  */
					}
				}
				System.out.println ("Sum of the matrices are\n");
				for(i=0;i<row;i++)
				{
					for(j=0;j<column;j++)
					{
						System.out.print(c[i][j]+" ");	
					}
					System.out.println();
				}
			}			
			catch(Exception e)
			{
			}
		}
	}
}