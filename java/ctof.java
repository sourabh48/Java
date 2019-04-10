import java.util.*;
public class ctof
{
	public static void main(String args[])
	{
		Scanner dis= new Scanner(System.in);
		System.out.println("Enter a temperature in celcius:\n");
		double c=dis.nextDouble();
		double f=((9*c)/5)+32;
		System.out.println(f);
	}
}