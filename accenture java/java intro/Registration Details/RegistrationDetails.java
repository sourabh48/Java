import java.util.*;

class RegistrationDetails
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = scn.nextLine();
        System.out.println("Enter your age:");
        String age = scn.nextLine();
        System.out.println("Enter your phoneno:");
        String phoneno =scn.nextLine();
        System.out.println("Enter your qualification:");
        String qualification = scn.nextLine();
        System.out.println("Enter your email id[Please provide valid id, after registering your registration id will be mailed]:");
        String email = scn.nextLine();
        System.out.println("Enter your noofexperience[if any]:");
        
        System.out.print("Dear "+name+", Thanks for registering in our portal, registration id will be mailed to "+email+" within 2 working days");
    }
}