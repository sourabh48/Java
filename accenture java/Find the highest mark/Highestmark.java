import java.util.*;

class Highestmark
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int[] arrmarks = new int[6];
        int i = 0;
        for(i=0;i<6;i++)
        {
           arrmarks[i] = scn.nextInt();
           if(arrmarks[i]<0)
           {
               break;
           }
        }
        if(i==6)
        {
           Arrays.sort(arrmarks);
           System.out.println("Highest mark is "+arrmarks[5]);
        }
        else
        {
            System.out.println("Invalid mark");
        }
    }
}