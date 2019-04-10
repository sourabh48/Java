import java.io.*;
class rectangle
{

	int height=0, base=0, area=0, perimeter=0,p=0,q=0;
	void set_data(int x,int y)
	{
		height=x;
		base=y;
	}
	void find_perimeter()
	{
		perimeter=2*(height+base);		
	}
	void find_area()
	{
		area=height*base;
		
	}
	void display()
	{
		System.out.println("Area= "+area);
		System.out.println("Perimeter= "+perimeter);
	}
	public static void main(String args[])
	{
		rectangle rec=new rectangle();
		int p=Integer.parseInt(args[0]);
		int q=Integer.parseInt(args[1]);
		rec.set_data(p,q);
		rec.find_perimeter();	
		rec.find_area();
		rec.display();
	}
}