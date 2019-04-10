import java.io.*;
import java.util.*;

class tcs
{
	public static void main(String args[])
	{
		int arraysize = 3;
		String[] wordarray = new String[arraysize];
		
		Scanner scn = new Scanner(System.in);
		
		for(int i=0;i<arraysize;i++)
		{
			wordarray[i] = scn.next();	
		}
		
		for(int i=0;i<arraysize;i++)
		{
			if(i==0)
			{
				for(int j = 0; j< wordarray[i].length();j++)
				{
					if(wordarray[i].charAt(j)=='a' || wordarray[i].charAt(j)=='e' || wordarray[i].charAt(j)=='i' || wordarray[i].charAt(j)=='o' || wordarray[i].charAt(j)=='u')
					{
						wordarray[i] = wordarray[i].replace(wordarray[i].charAt(j),'$');
					}
				}
			}

			if(i==1)
			{
				for(int j = 0; j< wordarray[i].length();j++)
				{
					if(wordarray[i].charAt(j)=='a' || wordarray[i].charAt(j)=='e' || wordarray[i].charAt(j)=='i' || wordarray[i].charAt(j)=='o' || wordarray[i].charAt(j)=='u')
					{
						wordarray[i] = wordarray[i];
					}
					else
					{
						wordarray[i] = wordarray[i].replace(wordarray[i].charAt(j),'#');
					}
				}
			}

			if(i==2)
			{
				wordarray[i] = wordarray[i].toUpperCase();
			}
		}		

		System.out.println(wordarray[0] + wordarray[1] + wordarray[2]);
	}

}