import java.util.*;

class InterchangeArray
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the first array : ");
        int first = scn.nextInt();
        
        if(first>=1)
        {
            System.out.println("Enter the elements in the first array ");
            
            int[] firstarray = new int[first];
            
            for(int i=0;i<first;i++)
            {
                firstarray[i] = scn.nextInt();
            }
            
            System.out.println("Enter the number of elements in the second array : ");
            int second = scn.nextInt();
           
            if(second>=1)
            {
                if(first==second)
                {
                    System.out.println("Enter the elements in the second array ");
                    int[] secondarray = new int[second];
                    
                    for(int i= 0; i<second;i++)
                    {
                        secondarray[i] = scn.nextInt();
                    }
                    
                    int[] temp = new int[first];
                    
                    for(int i=0; i<first;i++)
                    {
                        temp[i] = firstarray[i];
                        firstarray[i]=secondarray[i];
                        secondarray[i] = temp[i];
                    }
                    
                    System.out.println("The first array after swapping is : ");
                    for(int i =0; i<first;i++)
                    {
                        System.out.println(firstarray[i]);
                    }
                    System.out.println("The second array after swapping is : ");
                    for(int i=0; i<second;i++)
                    {
                        System.out.println(secondarray[i]);
                    }
                }
                else
                {
                    System.out.println("Unable to swap size differs");
                }
            }
            else
            {
                System.out.println("Invalid range");
            }
        }
        else
        {
            System.out.println("Invalid range");
        }
    }
}