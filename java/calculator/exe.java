import addition.*;
import subtraction.*;
import mod.*;
import multiplication.*;
import division.*;
import java.io.*;

public class exe
{
	public static void main(String args[])
	{
		addition a=new addition();
		subtraction b=new subtraction();
		multiplication c=new multiplication();
		division d=new division();
		mod e=new mod();
		
		DataInputStream dis=new DataInputStream(System.in);
		String w;
		try
		{
			System.out.println("What do u want to do in calculator?? press + or - or / or * or %....");
			w=dis.readLine();			
			
		
			switch(w)
			{

				case "+" : 	
					{
						a.add();
						System.out.println(a.add());
						break;
					}
				
				case "-" :
					 {
						
						b.sub();
						System.out.println(b.sub());
						break;
					}
				case "*":  
					  {
						
						c.mult();
						System.out.println(c.mult());
						break;
					  }
			
				case "/" :
				          {
						
					        d.div();
						System.out.println(d.div());
						break;
					   }
	
				case "%" : 	 
					   {
						
						e.mod();
						System.out.println(e.mod());
						break;
					   }
				default:
				}
			}
			catch(Exception ae)
			{}
		}
}



