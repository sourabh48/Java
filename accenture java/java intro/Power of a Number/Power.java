import java.util.Scanner;

class Power
{
    public static void main(String args[])
    {
        int result =1;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the number ");
        int number = scn.nextInt(); 
        System.out.println("Enter the digit");
        int digit = scn.nextInt();
        if(number<0 || digit<0)
        {
            System.out.println("Invalid Input");
        }    
        else
        {
            if(number>=0 && digit==0)
            {
                result = 1;
            }
            else if(number==0 && digit>=1)
            {
                result = 0;
            }
            else
            {
                for(int i=1;i<=digit;i++)
                {
                    result = result*number; 
                }
            }
            System.out.println(result);
        }
        
    }
}