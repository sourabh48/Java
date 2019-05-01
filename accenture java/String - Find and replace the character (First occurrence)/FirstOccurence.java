import java.util.*;

class FirstOccurence
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scn.nextLine();
        
        int length = input.length();
        
        System.out.println("Enter the character to be searched ");
        String userinput = scn.nextLine();
        
        System.out.println("Enter the character to replace ");
        String replace = scn.nextLine();
        
        if(input.contains(userinput))
        {
            System.out.println(input.replaceFirst(userinput,replace));
        }
        else
        {
            System.out.println("Character not found");
        }
    }
}