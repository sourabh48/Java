import java.io.*;
public class objcount
{
	public static void main	(String args[])
	{
		b obj1=new b();
		b obj2=new b();
		b obj3=new b();
		b obj4=new b();
		b obj5=new b();
		obj1.display();
	}
			
}
 class b
{	
	static int c=0;
	b()
	{
		c++;
	}
	void display()
	{
		System.out.println(c);
		
	}
}