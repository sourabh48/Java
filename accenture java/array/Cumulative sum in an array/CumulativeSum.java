import java.util.*;

class CumulativeSum
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter number of elements");
        int size = scn.nextInt();
        
        if(size>0)
        {
            System.out.println("Enter the elements");
            
            int[] arr1 = new int[size];
            int[] arr2 = new int[size];
            
            int temp = 0;
            for(int i=0;i<size;i++)
            {
                arr1[i]=scn.nextInt();
                temp=arr1[i]+temp;
                arr2[i]=temp;
            }
            for(int i = 0;i<size;i++)
            {
                System.out.print(arr2[i]+" ");
            }
        }
        else
        {
            System.out.println("Invalid Range");
        }
    }
}