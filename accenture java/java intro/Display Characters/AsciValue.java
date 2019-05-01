import java.util.*;
class AsciValue
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the digits");
        int[] arr = new int[4]; 
        for(int i = 0; i<4; i++)
        {
            arr[i] = scn.nextInt();
        }
        
        for(int j=0 ; j<4; j++)
        {
               char ch = (char)arr[j];
               System.out.println(arr[j]+"-"+ch);
        }
    }
}