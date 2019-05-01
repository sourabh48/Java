import java.util.*;

class HighestMarkPerSem
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no of semester:");
        
        int numberofsem=scn.nextInt();
        
        int[] semsubj = new int[numberofsem];
        
        for(int i = 0; i<numberofsem; i++)
        {
            System.out.println("Enter no of subjects in "+(i+1)+" semester:");
            semsubj[i] = scn.nextInt();   
        }
        
        int ch =0;
        
        int[] marks = new int[numberofsem];
        
        for(int i = 0; i<numberofsem && ch==0; i++)
        {
            int high = 0, mark = 0;
            System.out.println("Marks obtained in semester "+(i+1)+":");
            for(int j =0; j<semsubj[i];j++)
            {
                mark = scn.nextInt();
                if(mark<0)
                {
                    System.out.println("You have entered invalid mark");
                    ch = 1;
                    break;
                }
                if(mark>high)
                {
                    high=mark;
                }
            }
            marks[i]=high;
        }
        for(int i = 0; i<numberofsem && ch == 0;i++)
        {
            System.out.println("Maximum mark in "+String.valueOf(i+1)+" semester "+marks[i]);
        }
    }
}





