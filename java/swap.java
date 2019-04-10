import java.util.*;
public class swap 
{

	public static void main(String[] args)
	{
	
			int x=0,y=0,z=0;
			Scanner dis=new Scanner(System.in);
			try
			{
				System.out.println("Enter the first number");
				x=dis.nextInt();
				System.out.println("Enter the second number");
				y=dis.nextInt();
				System.out.println("Enter the third number");
				z=dis.nextInt();
				
				System.out.println("\n\nBEFORE SWAPING\n\n");
				System.out.println("the first number before swaping is: "+x);
				System.out.println("the second number before Swaping is: "+y);
				System.out.println("the third number before swaping is:"+z);
				
				int temp=0;
				
				temp=x;
				x=y;
				y=z;
				z=temp;
				
				System.out.println("\n\nAFTER SWAPING\n\n");
				System.out.println("FIRST NUMBER: "+x);
				System.out.println("SECOND NUMBER:"+y);
				System.out.println("THIRD NUMBER:"+z);
			}
			catch(Exception e)
			{}
	}

}
