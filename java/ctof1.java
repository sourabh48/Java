import java.util.*;
class celcius
{
	double c,f;
	celcius(double a)
	{
		c=a;
	}

	double farhenheit()
	{
		return((((9*c)/5)+32));
	}
	
}

class ctof1
{
	public static void main(String args[])
	{
		double d=0;
		try
		{
			Scanner dis= new Scanner(System.in);
			System.out.println("Enter a temperature in celcius:\n");
			 d=dis.nextDouble();
		}
		catch(Exception e)
		{}

		celcius cel=new celcius(d);
		double fer=cel.farhenheit();
		System.out.println(fer);
	}
}	