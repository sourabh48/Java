import java.util.*;

class EvenNumber
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the size of an array:");
        int size = scn.nextInt();
        
        if(size>0)
        {
            int[] arr = new int[size];
            ArrayList al = new ArrayList();
            
            System.out.println("Enter the array elements:");
            for(int i = 0;i<size;i++ )
            {
                arr[i]=scn.nextInt();
                if(arr[i]%2==0 && arr[i]>=2 && arr[i]<8)
                {
                    al.add(arr[i]);
                }
            }
            
            if(al.size()!=0)
            {
                for(int i=0; i<al.size(); i++)
                {
                    System.out.print(al.get(i));
                }
            }
            else
            {
                System.out.println("Single digit even number is not found in the array");
            }
        }
        else
        {
            System.out.println("Invalid array size");
        }
        scn.close();
    }
}