import java.util.*;

class DuplicateElement
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the size of an array");
        int size1 = scn.nextInt();
        
        if(size1>0)
        {
            int size2 = size1+1;
            
            int[] arr1 = new int[size1];
            int[] arr2 = new int[size2];
            
            System.out.println("Enter the array elements:");
            
            for(int i = 0; i<size1; i++)
            {
                arr1[i]=scn.nextInt();
                arr2[i]=arr1[i];
            }
            
            System.out.println("Enter the position of the element to be replicated:");
            int position = scn.nextInt();
            
            if(position<size1)
            {
                arr2[size2-1]=arr1[position];
                
                for(int i = 0; i<size2;i++)
                {
                    System.out.println(arr2[i]);   
                }
                
            }
            else
            {
                System.out.println("Position is greater than the size of an array ");
            }
        }
        else
        {
            System.out.println("Invalid array size");
        }
    }
}