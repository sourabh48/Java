import java.io.*;
public class methodoverloading
{
	public static void main(String args[])
	{
		child c=new child();
		c.parentmethod();
		c.childmethod();
	}
}
class parent
{
	void parentmethod()
	{
		System.out.println("Hello Parent");
	}
}
class child extends parent
{
	void childmethod()
	{
		System.out.println("Hello Child");
	}
	void parentmethod()
	{
		System.out.println("Hello Step-Parent");
	}
}
		