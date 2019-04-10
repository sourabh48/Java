import java1.*;
import java2.*;

public class runner
{
	public static void main(String args[])
	{
		monitor m=new monitor();
		//m.calculation();
		int x=m.calculation();
		//m.display();
		
		keyboard k=new keyboard();
		int y =k.calculation();
		//m.display();
		
		int i=0;
		i=x+y;
		System.out.println("NEW SUM= " +i);
	}
}