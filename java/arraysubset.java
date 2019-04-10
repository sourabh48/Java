import java.io.*;
import java.util.*;

public class arraysubset
{
	public static void main(String args[])
	{
		int[] array = new int[] {1,2,3};
		int counter = 0;
		do
		{
			for(int i = counter; i <= array.length-1; i++)
			{
				for(int j = counter; j <= i; j++)
				{
					System.out.print(array[j]);
				}	
				System.out.println();
			}
			counter++;				
		}
		while(counter != array.length);
	}
}