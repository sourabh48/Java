import java.util.*;

class Coins
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the age:");
        int age = scn.nextInt();
        
        if(age>0)
        {
            int noofcoins = age*age*age;
            
            System.out.println("Meenu gets "+noofcoins+" coins");
        }
        else
        {
            System.out.println("Invalid Age");
        }
        
    }
}