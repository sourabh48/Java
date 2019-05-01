import java.util.*;
import java.util.regex.*;

class PanCard
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the PAN no:");
        String number = scn.nextLine();
        
        int length = number.length();
        
        if(length == 10)
        {
            Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
            
            Matcher matcher = pattern.matcher(number);
            
            if(matcher.matches())
            {
               System.out.println("Valid PAN no"); 
            }
            else
            {
                System.out.println("Invalid PAN no");
            }
            
        }
        else
        {
            System.out.println("Invalid PAN no.");
        }
    }
}