import java.util.*;

public class ArrayException
{
    public int size,index;
    public int arr[];
    
    public String getPriceDetails()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        try
        {
            size = scn.nextInt();
        
            size = Integer.parseInt(String.valueOf(size));
            arr = new int[size];
        
            System.out.println("Enter the price details ");
            for(int i= 0; i<size;i++)
            {
                arr[i] = scn.nextInt();
            }
        
            System.out.println("Enter the index of the array element you want to access");
            index = scn.nextInt();
            
            return ("The array element is "+ arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            return("Array index is out of range");
        }
        catch(InputMismatchException e)
        {
           return("Input was not in the correct format"); 
        }
    }
    
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        ArrayException ex = new ArrayException();
        System.out.println(ex.getPriceDetails());
    }
}
