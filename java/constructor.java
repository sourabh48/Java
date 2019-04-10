import java.io.*;
class top
{
	top()
	{
		System.out.println("top class");
	}
}
class middle extends top
{
	{
		System.out.println("middle class");
	}
}
	
class bottom extends middle
{
	{
		System.out.println("bottom class");
	}
	void disp()
	{
		System.out.println("hi");
	}
}
public class constructor
{
	public static void main(String args[])
	{
		bottom b=new bottom();
		b.disp();
	}
}

