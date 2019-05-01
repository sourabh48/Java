import java.util.*;
class LeapYear
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the year");
        
        try
        {
            int year = scn.nextInt(); 
            if(year>999 && year<10000)
            {
                if(((year%4)==0 && (year%100)!=0)||(year%400)==0)
                {
                    System.out.println("Leap Year");
                }
                else
                {
                    System.out.println("Not a Leap Year");
                }
            }
            else
            {
                System.out.println("Invalid Year");
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid Year");
        }
        
    }
}