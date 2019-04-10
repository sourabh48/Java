import java.io.BufferedReader;

import java.io.InputStreamReader;


import java.util.*;

import java.lang.Math.*;



class TestClass 
{

    public static void main(String args[] ) throws Exception
 
   {

        int a,b;

        Scanner scn = new Scanner(System.in);

        a = scn.nextInt();

        b = scn.nextInt();

        System.out.println(commDiv(a,b));

    }

    
static int commDiv(int a, int b)

    {

        int n = gcd(a,b);

        
int result = 0;

       
	for(int i=1;i<=Math.sqrt(n);i++)

        {

            if(n%i==0)

            {

                if(n/i == i)

                {

                    result = result+1;

                }

                else

                {

                    result = result+2;

                }

            }

        }

        return result;

    }


    static int gcd(int a, int b)

    {

	System.out.println(a+" "+b);
        if(a==0)

        return b;


        return gcd(b%a,a);

    }


}
