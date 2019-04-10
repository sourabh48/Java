package java1;

	class CPU
	{
		public void display()
		{
			System.out.println("YO! MONITOR");
		}
	}
	public class monitor extends CPU
	{
		public int calculation()
		{
			
			int a=2 ,b=5,c=0;
			c=a+b;
			System.out.println("SUM2= "+c);
			return (c);
		}
	}

