import java.io.*;

public class vote 
{
public static void main(String args[])
	{
			
			int win=1,loose=1,waste=0,poll=0,i=0;
			
			
			DataInputStream dis=new DataInputStream(System.in);
			
			try
			
			{
				/*Input conditions*/


				System.out.println("\n\nWELCOME TO ELECTION SOFTWARE 1.1.....\n\n");
				
				System.out.println("Enter the number of voters:\n");
				
				int voters=Integer.parseInt(dis.readLine());
				
				System.out.println("Enter the number of candidates:\n");
				int n=Integer.parseInt(dis.readLine());
				
				int candidate[]=new int[n+1];
				
				loop: for( i=1;i<=voters;i++)
					{
						System.out.println("Enter the sl no of candidate you support or else press 0:\n");
						poll=Integer.parseInt(dis.readLine());
				
						if (poll<1 && poll>(n))
						{
							waste=waste+1;
							continue loop;
						}
						else
						{
					        	candidate[poll]=candidate[poll]+1;
						
						}
					
					}	

				System.out.println("\n\nVOTING RESULT BY VOTE 1.1...\n\n");

				
					for( i=1;i<=n;i++)
				
					{
						System.out.println("The Candidate of I.D.: "+(i)+" has received " +candidate[i]+" votes");
						
					}  					
			      
				
					
				for( i=1;i<=(n-1);i++)
				{
					for(int j=(i+1);j<=(n-1);j++)	
					{
						
					
					
						 if(candidate[i]>candidate[j])
						{
							loose=j;
							
						}
					
					
						else if(candidate[i]<candidate[j])
						{
							win=j;
							
						}
					
					}
				} 
				System.out.println("\n\nDECLARATION OF WINNER \n");
				
				System.out.println("winner is "+win+ "received "+candidate[win]+" votes");
				System.out.println("looser is "+loose+"received "+candidate[loose]+" votes");
					
		}
		catch(Exception e)
		{}
			
	}	
}
		
			

