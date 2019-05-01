import java.util.*;
import java.util.regex.*;

class Count
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name:");
        
        String name = scn.nextLine();
        
        Pattern pattern = Pattern.compile("^[a-zA-Z ]*$");
        
        Matcher matcher = pattern.matcher(name);
        
        
        if(matcher.matches())
        {
            System.out.println(name+" has "+name.length()+" characters");
        }
        else
        {
            System.out.println("Invalid input");
        }
        
        
    }
}