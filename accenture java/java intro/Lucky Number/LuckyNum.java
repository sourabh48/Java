import java.util.Scanner;

class LuckyNum
{
    public static void main(String args[])
    {
        int carno,sum;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the car no.");
        carno = scn.nextInt();
        
        if(carno>=1000 && carno<10000)
        {
            for(sum=0;carno!=0;carno/=10)
            {
                sum+=carno%10;
            }
            if(((sum%3)==0)||((sum%5)==0)||((sum%7)==0))
            {
                System.out.println("Lucky Number");   
            }
            else if(carno<0 || carno==0 || carno>10000)
            {
                System.out.println("Sorry its not my lucky number.");
            }
        }
        else
        {
            System.out.println(carno+" is not a valid car number");
        }
    }
}