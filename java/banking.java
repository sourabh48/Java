
import java.io.*;
class information
{
	int x=0,withdrawamt=0, dipositamt=0, principle=0,accountnumber=0;
	DataInputStream dis= new DataInputStream(System.in);
	public void opening()
	{
		try
		{
			System.out.println("Enter the account number");
			accountnumber=Integer.parseInt(dis.readLine());
			System.out.println("Enter the principle amount");
			x=Integer.parseInt(dis.readLine());
			if(x>=1000)
			{
				System.out.println("Account Created");
				principle=x;
				System.out.println("Your account has:Rs "+principle);
			}
			else
				System.out.println("Account Terminated");
		}
		catch(Exception e)
		{}	
				
	}
	public void diposit()
	{
		try
		{
			System.out.println("Enter the amount to be withdrawn");
			dipositamt=Integer.parseInt(dis.readLine());
			principle=principle+dipositamt;
			System.out.println("YOUR BALANCE: "+principle);
		}
		catch(Exception e)
		{}
	}
	public void withdraw()
	{
		try
		{
			System.out.println("Enter the amount to be withdrawn");
			withdrawamt=Integer.parseInt(dis.readLine());
			principle=principle-withdrawamt;
			System.out.println("YOUR REMAINING BALANCE:"+principle);	
		}
		catch(Exception e)
		{}
	}
}
	
public class banking
{
	public static void main(String args[])
	{
		DataInputStream disp= new DataInputStream(System.in) ;	
		information i=new information();
		i.opening();
		
		int a=0;
		
		try
		{
			System.out.println("IF YOU WANT TO DIPOSIT PRESS 1 OR IF YOU WANT TO WITHDRAW PRESS 2");
			a=Integer.parseInt(disp.readLine());
		}
		catch(Exception e)
		{}

		switch(a)
		{
			case 1:
			{
				i.diposit();
				break;
			}
			case 2:
			{
				i.withdraw();
				break;
			}
			default:
			{
				System.out.println("INVAILD INPUT....!!!!!! ");
			}
		}		
	}			
}