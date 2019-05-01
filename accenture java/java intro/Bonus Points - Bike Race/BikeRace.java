import java.util.*;

class BikeRace
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        String distance = scn.nextLine();
        int intdistance = Integer.parseInt(distance);
        
        if(intdistance>0)
        {
            String[] distarray = distance.split("");
            int[] digitarr = new int[distance.length()];
            int mult1=1,mult2=1;

            for(int i=0;i<distance.length();i++)
            {
               digitarr[i] = Integer.parseInt(distarray[i]); 
            }
        
            for(int i = 0; i<distance.length();i++)
            {
                if(i%2==0)
                {
                    mult1 = mult1*digitarr[i];
                }
                else
                {
                    mult2 = mult2*digitarr[i];
                }
            }
        
            if(mult1<mult2)
            {
                System.out.println("Your bonus points is "+mult2);
            }
            else if(mult1>mult2)
            {
                System.out.println("Your bonus points is " +mult1);
            }
            else if(mult1==mult2)
            {
                System.out.println("Your bonus points is "+(mult1*2));
            }
        }
        else if(intdistance==0)
        {
            System.out.println("Your bonus points is 0");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}