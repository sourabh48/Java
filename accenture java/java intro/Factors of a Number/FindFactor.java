import java.util.*;


class FindFactor
{
    public static void main(String args[])
    {
       Scanner scn = new Scanner(System.in);
       
       int number =scn.nextInt();
       number = Math.abs(number);
       
       if(number != 0)
       {
           for(int i=1; i <= number; i++)
           {
                if(number%i==0)
                {
                    System.out.println(i+" ");
                }
            }
        }
        else
        {
            System.out.println("No Factors.");
        }
    }
}
