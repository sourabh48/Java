import java.util.*;
import java.util.regex.*;

class Authority
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Inmate's name: ");
        String first = scn.nextLine();
        System.out.println("Inmate's father's name: ");
        String second = scn.nextLine();
        
        Pattern pattern = Pattern.compile("^[a-zA-Z ]*$");
        
        Matcher matcher1 = pattern.matcher(first);
        Matcher matcher2 = pattern.matcher(second);
        
        if(matcher1.matches()==true && matcher2.matches()==true)
        {
            System.out.println(first+" "+second) ;
        }
        else
        {
            System.out.println("Invalid name");
        }
    }
}