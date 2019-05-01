import java.util.*;

class ReverseNumber
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter The Number:");
        int num = scn.nextInt();
        
        if(num<0)
        {
            System.out.println("Number should be positive.");
        }
        else if(num==0)
        {
            System.out.println("Output is:0");
        }
        else
        { 
            int reminder,reverse =0;
            while(num>0)
            {
                reminder= num%10;
                reverse = reverse*10+reminder;
                num=num/10;
            }
            System.out.println("Output is:"+reverse);
        }
    }
}