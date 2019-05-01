import java.util.*;

class Username
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scn.nextLine();
        System.out.println("Welcome " + name);
    }
}