import java.util.*;
class PrimeNumbers
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        if(a<b && a>0 && b>0)
        {
            while(a<=b)
            {
                if(isPrime(a))
                {
                    System.out.println(a);   
                }
                a++;
            }
        }
        else
        {
            System.out.println("Provide valid input");
        }
    }
    
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for (int i =2; i<= Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
}