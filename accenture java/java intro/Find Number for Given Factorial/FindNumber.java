import java.util.*;

class FindNumber
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        int number = scn.nextInt();
        
        if(number<=0)
        {
            System.out.println("Invalid Input");
        }
        else if(number==1)
        {
            System.out.println("1");
        }
        else
        {
            int temp = 1,i =2;
            
            while(temp<number)
            {
                temp=temp*i;
                i++;
            }
            
            if(temp==number)
            {
                System.out.println(i-1);
            }
            else
            {
                System.out.println("Sorry.The given number is not a perfect factorial");
            }
        }
    }
    
}