import java.io.*;
public class jagged
{
	public static void main(String args[])
	{
		int i=0,j=0;
		int arr[][]=new int [4][];
		arr[0]=new int[4];
		arr[1]=new int[2];
		arr[2]=new int[1];
		arr[3]=new int[3];
		System.out.println(" Row count"+arr.length);
		System.out.println("\n Row size"+arr[i].length);
        
		
	/*      arr[0][0]=1;
		arr[0][1]=2;       // output portion tester//
		arr[0][2]=3;
		arr[0][3]=4;
		arr[1][0]=5;
		arr[1][1]=6;	
		arr[2][0]=7;
		arr[3][0]=8;
		arr[3][1]=9;
		arr[3][2]=10;  */
		
		
		for ( i=0;i<arr.length;i++)
		{
			for( j=0;j<arr[i].length;j++)
			{
				DataInputStream dis= new DataInputStream(System.in);
				{
					try
					{
						System.out.println("Enter the number i j:");			
						arr[i][j]=Integer.parseInt(dis.readLine());
					}
					catch(Exception e)
					{}
				}
			}
		}	
		 System.out.println("\n \n jagged array output......\n \n");
		 for(i=0;i<arr.length;i++)
		   {
			 for(j=0;j<arr[i].length;j++)
			 {
				 System.out.print(arr[i][j]+"\t");
			 }
			 System.out.println( );
		   }
		
	}
}

