import java.util.*;

class Count
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the standard:");
        int standard = scn.nextInt();
        
        int i=0,temp=0,square=0;
        
        if(standard>0 && standard<13)
        {
            for(i=1;i<=standard;i++)
            {
                square= i*i;
                temp=temp+square;
            }
            System.out.println("Nila gets " +temp+ " pencils");
        }
        else
        {
            System.out.println("Invalid Standard");
        }
    }
}