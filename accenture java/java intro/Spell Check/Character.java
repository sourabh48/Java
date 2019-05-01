import java.util.*;

class Character
{
    public static void main(String args[])
    {
        int nomatch =0;
        Scanner scn = new Scanner(System.in);
        String initial = "RAINBOW";
        int len = initial.length();
        String[] arr = new String[len];
        System.out.println("Enter the first letter:");
        arr[0] = scn.nextLine();
        System.out.println("Enter the second letter:");
        arr[1] = scn.nextLine();
        System.out.println("Enter the third letter:");
        arr[2] = scn.nextLine();
        System.out.println("Enter the fourth letter:");
        arr[3] = scn.nextLine();
        System.out.println("Enter the fifth letter:");
        arr[4] = scn.nextLine();
        System.out.println("Enter the sixth letter:");
        arr[5] = scn.nextLine();
        System.out.println("Enter the seventh letter:");
        arr[6] = scn.nextLine();
        
        String userinput = String.join("",arr);
        
        
        if(initial.equals(userinput))
        {
            System.out.println(initial);
        }
        else
        {
            System.out.println("The spelling is wrong");
        }
        
    }
}