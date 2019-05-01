import java.util.*;

class IncomeCal
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no of hours worked in a day:");
        int hrs = scn.nextInt();
        
        int salary = 0;
        
        if(hrs>=0 && hrs<=24)
        {
            salary = 100*(hrs*365);
            System.out.println("Total income in a year:"+salary);
        }
        else
        {
            System.out.println("Unable to calculate the earnings.");
        }
    }
}