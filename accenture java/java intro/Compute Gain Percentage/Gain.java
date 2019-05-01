import java.util.*;

class Gain
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Price of old scooter:");
        int oldprice= scn.nextInt();
        System.out.println("The amount spent for repair:");
        int repair=scn.nextInt();
        System.out.println("Sold Price:");
        int soldprice=scn.nextInt();

        if(oldprice<=0 || soldprice<=0 || repair < 0 )
        {
            System.out.println("Incorrect Inputs");
        }
        else
        {
            int cost = (oldprice+repair);
            if(soldprice>cost)
            {
               double gain = (soldprice - cost);
               double gainp = ((gain/cost)*100);
               System.out.println("Gain percentage is:"+ String.format("%.2f",gainp));
            }
            else
            {
                System.out.println("Unable to calculate Gain Percentage");
            }
        }
    }
}