class Mythread implements Runnable
{
	public void run()
	{
		synchronized(this)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName());
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException ie)
				{

				}
			}
		}
	}
}
public class thread
{
	public static void main(String args[])
	{
		Mythread t=new Mythread();
		new Thread(t,"yo").start();
		new Thread(t,"die hard").start();
	}
}